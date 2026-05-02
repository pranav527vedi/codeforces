import os
from dotenv import load_dotenv
from langchain_google_genai import ChatGoogleGenerativeAI, GoogleGenerativeAIEmbeddings
from langchain_community.document_loaders import PyPDFLoader
from langchain.text_splitter import RecursiveCharacterTextSplitter
from langchain_community.vectorstores import FAISS
from langchain_core.messages import HumanMessage, SystemMessage

# --- Load API key from .env ---
load_dotenv()
GOOGLE_API_KEY = os.getenv("GOOGLE_API_KEY")

# --- Ask user for PDF path ---
PDF_PATH = input("Enter the path to your PDF file:F: ").strip()

if not os.path.exists(PDF_PATH):
    print("❌ File not found! Check the path and try again.")
    exit()

# --- Load & Split PDF ---
loader = PyPDFLoader(PDF_PATH)
pages = loader.load()

splitter = RecursiveCharacterTextSplitter(
    chunk_size=1000,
    chunk_overlap=200
)
chunks = splitter.split_documents(pages)
print(f"✅ PDF loaded — {len(pages)} pages, {len(chunks)} chunks")

# --- Embed & Store ---
embeddings = GoogleGenerativeAIEmbeddings(
    model="models/embedding-001",
    google_api_key=GOOGLE_API_KEY
)
vectorstore = FAISS.from_documents(chunks, embeddings)
retriever = vectorstore.as_retriever(search_kwargs={"k": 4})
print("✅ VectorDB ready!")

# --- Gemini Setup ---
model = ChatGoogleGenerativeAI(
    model="gemini-2.0-flash",
    google_api_key=GOOGLE_API_KEY
)

# --- Chat ---
chat_history = []

def chat(user_question: str):
    relevant_chunks = retriever.invoke(user_question)
    context = "\n\n".join([doc.page_content for doc in relevant_chunks])

    messages = [
        SystemMessage(content=f"""You are a helpful assistant that answers questions 
based on the provided PDF content. If the answer isn't in the context, say so.

Context from PDF:
{context}"""),
        *chat_history,
        HumanMessage(content=user_question)
    ]

    response = model.invoke(messages)
    chat_history.append(HumanMessage(content=user_question))
    chat_history.append(response)
    return response.content


# --- Run ---
print(f"\n📄 Chatbot ready for: {os.path.basename(PDF_PATH)}")
print("Type 'quit' to exit\n")

while True:
    question = input("You: ")
    if question.lower() == "quit":
        break
    answer = chat(question)
    print(f"\nBot: {answer}\n")
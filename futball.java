import java.util.*;
public class  futball{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        String ans = "NO";
        for(int i = 0; i <= arr.length - 7; i++){
            char first = arr[i];
            if(arr[i+1]==first && arr[i+2]==first && arr[i+3]==first && arr[i+4]==first && arr[i+5]==first && arr[i+6]==first){
                System.out.println("YES");
            }
        }System.out.println(ans);
    }   
}
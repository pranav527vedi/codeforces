import java.util.*;
public class test{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        Boolean flag=false;
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==1){
                flag = true;
                System.out.println("HARD");
            }
            else{
                System.out.println("Easy");
            }
        }
        
        
       
        
    }
}

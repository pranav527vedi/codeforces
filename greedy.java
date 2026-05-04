import java.util.*;
public class greedy{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int []arr = {100,20,10,5,1};
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            count+=n/arr[i];
            n=n%arr[i]; 
        }System.out.println(count);
    }
}
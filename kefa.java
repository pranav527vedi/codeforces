import java.util.*;
public class kefa{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int max = 1;
        int [] arr = new int[n];
        
        // pehle poora array bhar ✅
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        // phir compare karo ✅
        for(int i = 0; i < n-1; i++){
            if(arr[i] <= arr[i+1]){
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        
        System.out.println(max); 
    }
}
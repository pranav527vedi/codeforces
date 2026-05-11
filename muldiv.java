import java.util.*;
public class muldiv{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       
        while(t-->0){
            int n = sc.nextInt();
            int count = 0;
            while(n%6!=0){
                if(n%2 == 0 &&  n%3 ==0){
                    n=n*2;
                    count++;
                }
            }
        }
    }
}
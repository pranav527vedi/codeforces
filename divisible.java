import java.util.*;
public class divisible{
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            while(a%b!=0){
                a++;
                count++;
                
            }System.out.println(count);
        }
    }
}
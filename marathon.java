import java.util.*;
public class marathon{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
       
       
        while(t-->0){
             int count = 0;
            
            int a  = sc.nextInt();
            int b  = sc.nextInt();
            int c  = sc.nextInt();
            int d  = sc.nextInt();
            if(b>a) count++;
            if(c>a) count++;
            if(d>a) count++;
            System.out.println(count);

        }
    }
}
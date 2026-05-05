import java.util.*;
public class aa{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = String.valueOf(n);
            System.out.println(s.charAt(0) - '0'+s.charAt(1) - '0');
           
            
        }
    }
}
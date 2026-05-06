import java.util.*;
public class word{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            String b = sc.next();
            if(a.length()==3 && b.length()==3){
            System.out.println(b.charAt(0)+a.substring(1)+" "+a.charAt(0)+b.substring(1));
            }

        }
    }
}



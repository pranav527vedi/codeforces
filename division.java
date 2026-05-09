import java.util.*;
public class division{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            if(a>=1900){
                System.out.println("Division 1");
            }else if(a>=1600 && a<=1899){
                System.out.println("Division 2");
            }else if(a>=1400 && a<=1599){
                System.out.println("Division 3");
            }else{
                System.out.println("Division 4");
            }
        }
    }
}
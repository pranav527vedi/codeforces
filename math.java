import java.util.*;
public class math{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ss = sc.next();
        for(int  i = 0;i<s.length();i++){
            if(s.charAt(i)==ss.charAt(i)){
                System.out.print("0");
            }
            else{
                System.out.print("1");
            }
            

        }
    }
}
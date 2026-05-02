import java.util.*;
public class abbrevation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        if(c.length()>10){
            char first = c.charAt(0);
            char last = c.charAt(c.length()-1);
            int middle = c.length() - 2; 
            System.out.println(first +"" +middle + last);

        }
        else{
            System.out.println(c);
        }
    }

}
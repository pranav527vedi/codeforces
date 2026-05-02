import java.util.*;
public class cap{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = Character.toUpperCase (s.charAt(0))+s.substring(1);
        System.out.println(result);
    }
}
import java.util.*;
public class vasya{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0 ;
        for(int i = 0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                count++;  // sirf yahan count karo
            }      
        }
        if(count > s.length() - count){
            s = s.toUpperCase();
        }
        else{
            s = s.toLowerCase();
        } System.out.println(s);
    }
}

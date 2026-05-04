import java.util.*;
public class year{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Character> set = new HashSet<>();
        while(true){
            n++;
            set.clear();
            String s = String.valueOf(n);
            for(int i=0;i<s.length();i++){
                set.add(s.charAt(i));
            }
            if(set.size()==4){
                System.out.println(n);
                break;
            }
        }
    }
}
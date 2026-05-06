import java.util.*;
public class check{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if("codeforces".contains(s)){
                System.out.println("Yes");
                    
            }
            else{
                System.out.println("No");
            }
            
        }
    }
}
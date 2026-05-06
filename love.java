import java.util.*;
public class love{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int count =0;
            if(s.length()==10){
                for(int i = 0; i<10;i++){
                    if(s.charAt(i)!="codeforces".charAt(i)){
                        count++;
                    }

                }

            }System.out.println(count);
        }

    }
}
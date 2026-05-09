import java.util.*;
public class restore{
    public static void main(String[]args){ 
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long x2 = sc.nextLong();
        long x3 = sc.nextLong();
        long x4 = sc.nextLong();
        long max = Math.max(x1, Math.max(x2, Math.max(x3, x4)));
        
       
        if(x1 == max){
            System.out.println(max-x2);
            System.out.println(max-x3);
            System.out.println(max-x4);
        }else if(x2 == max){
            System.out.println(max-x1);
            System.out.println(max-x3);
            System.out.println(max-x4);
        }else if(x3 == max){
            System.out.println(max-x1);
            System.out.println(max-x2);
            System.out.println(max-x4);
        }else {
            System.out.println(max-x1);
            System.out.println(max-x2);
            System.out.println(max-x3);
        }
    }
}



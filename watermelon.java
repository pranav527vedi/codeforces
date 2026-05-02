import java.util.*;
public class watermelon{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the weight of melon");
        
        int n = sc.nextInt();
        
        if(n>2 && n%2==0){
            System.out.println("it can be divided into two equal parts");
        }
        else{
            System.out.println("it can not be divided into two equal parts");

        }
    }

}
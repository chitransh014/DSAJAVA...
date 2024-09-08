import java.util.*;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        
        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit );
            //remove last
            n = n/10;
        }
       System.out.println();
    }
}

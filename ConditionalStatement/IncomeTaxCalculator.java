import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        int tax;

        if(Income<500000){
            tax = 0;
        }
        else if(Income>500000 && Income<1000000){
            tax= (int) (Income*0.2);
        }
        else{
            tax =  (int) (Income*0.4);
        }
        System.out.println("Tax is =" +tax);
    }
    
}

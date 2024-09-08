import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        System.out.println("Eter Operator");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Add=" + (a + b));
                break;
            case '-':
                System.out.println("Sub=" + (a - b));
                break;
            case '*':
                System.out.println("Mul=" + (a * b));
                break;
            case '/':
                System.out.println("Div =" + (a / b));
                break;
            case '%':
                System.out.println("Mod=" + (a % b));
                break;
            default:
                System.out.println("wrong operator");
        }

    }
}

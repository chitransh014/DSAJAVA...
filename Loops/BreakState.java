public class BreakState {
    public static void main(String args[]){
        int n = 0;
        while(n<=5){
            if (n==4){
            break;
            }
            System.out.println(n);
            n++;
        }
        System.out.println("I am out of the loop");
    }
    
}

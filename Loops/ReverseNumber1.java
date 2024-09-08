public class ReverseNumber1 {
    public static void main(String args[]){
        int n = 99562;
        int rev = 0;
        while(n>0){
           int lastdigit = n%10;
           rev = (rev*10) + lastdigit;
           n = n/10;


        }
        System.out.println(rev);
    }
    
}

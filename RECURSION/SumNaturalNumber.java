

public class SumNaturalNumber {

    public static int sum(int n){
        if(n>0){
            int snm1 = sum(n-1);
            int sn = n+snm1;
             return sn;
        }
        return 0;
    }
    /*
     if(n==1){
       return 1;
       }
       int snm1 = sum(n-1);
            int sn = n+snm1;
             return sn;
     */

    public static void main(String[] args) {
        System.out.println(sum(100));
    }
}

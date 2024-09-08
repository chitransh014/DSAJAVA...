
// if LSB is 1 that means number is odd and LSB is 0 then number is even
public class OddEven {
    public static void OddOrEven(int n){
        int bitmask=1;
        if((n &  bitmask) ==0){
            //bitmask compare only with lsb of number 
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        OddOrEven(3);
        OddOrEven(5);
        OddOrEven(8);
    }
}

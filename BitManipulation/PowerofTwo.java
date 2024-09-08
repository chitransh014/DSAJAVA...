public class PowerofTwo {
    public static boolean Power_of_2(int n){
        if((n&n-1)==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(Power_of_2(7));
    }
    
}

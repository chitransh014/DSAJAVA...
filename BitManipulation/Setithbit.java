public class Setithbit {
    public static int Set_ith_bit(int n,int i){
        int bitmask=1<<i;
        return (n|bitmask);
    }
    public static void main(String[] args) {
        System.out.println(Set_ith_bit(15, 4));
    }
    
}

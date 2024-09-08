public class CleariThbit {
    public static int Clear_ith_Bit(int n,int i){
        int bitmask=~(1<<i);
        return (n&bitmask);

    }
    public static void main(String[] args) {
        System.out.println(Clear_ith_Bit(10, 1));
    }
    
}

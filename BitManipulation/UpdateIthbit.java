public class UpdateIthbit {
    public static int Set_ith_bit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int Clear_ith_bit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int Update_ith_bit(int n,int i,int newbit){
        if (newbit==0){
            return Clear_ith_bit(n, i);

        }else{
            
            return Set_ith_bit(n, i);
        }
    }
    public static void main(String[] args) {
        
       System.out.println(Update_ith_bit(10, 2, 1));
    }
}

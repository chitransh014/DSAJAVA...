public class FriendsPairing {

    public static int Pairs(int n){

        if(n==1 || n==2){
            return n;
        }
        // pairs 
        int nm1 =Pairs(n-1);
        int nm2 =Pairs(n-2);
        

        return (nm1) +(n-1)*(nm2);
    }
    public static void main(String[] args) {
        System.out.println(Pairs(3));
    }
}

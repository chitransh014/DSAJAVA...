public class Tilingproblem {

    public static int Tiling_Problem(int n){
        if(n==0 || n==1){
            return 1;
        }
        // for vertical way
        int nm1 = Tiling_Problem(n-1);

        // for horizental way
        int nm2  =Tiling_Problem(n-2);
        return nm1+nm2;
    }
    public static void main(String[] args) {
        System.out.println(Tiling_Problem(4));
    }
}

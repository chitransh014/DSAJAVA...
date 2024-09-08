public class GridWays {
    public static int grid_Ways(int i, int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){ // condition for last cell
            return 1;
        }else if(i==n ||j==n){  // boundary cross condition
            return 0;
        }
        int way1=grid_Ways(i+1, j, n, m);
        int way2=grid_Ways(i, j+1, n, m);
        return way1+way2;


    }
    public static void main(String[] args) {
        int n =3,m=3;
        System.out.println(grid_Ways(0, 0, n, m));
    }
}

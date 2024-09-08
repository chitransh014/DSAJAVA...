public class ZeroOnetrianglePattern {
    public static void Zero_One_Triangle_Pattern(int n){

        for(int i = 1; i<=n ; i++){

            for(int j=1 ; j<=i ; j++){
                int sum = i+j;

                //for find even number
                if(sum%2==0){
                System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String args[]) {

        Zero_One_Triangle_Pattern(5);
        
    }
}

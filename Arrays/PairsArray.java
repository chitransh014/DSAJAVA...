public class PairsArray {

    public static void Pairs_Array(int arr[]){

        int totpairs =0;

        for(int i = 0 ;i<arr.length;i++){
            int curr=arr[i];  //curr-->5,8,9,4,7,6
            for(int j=i+1; j<arr.length;j++){
                System.out.print("("+curr +","+arr[j]+")"+" " );
                totpairs++;
                
            }
            System.out.println();
        }
        System.out.print("Total Pairs " +totpairs);
    }
    public static void main(String args[]) {
        int arr[]={5,8,9,4,7,6};
        Pairs_Array(arr);
    }
    
}

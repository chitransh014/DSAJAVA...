
public class TransposeOfMatrix {
   
    public static void printarr(int arr[][]) {
        
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int row=2 ,column=3;
        int arr[][] = { { 12, 13 }, 
                        { 14, 15, 16 } };
        //display original matrix
        System.out.println("Given Matrix -->");
        printarr(arr);
        int transpose[][] = new int[column][row];
        
        
    
       
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                transpose[j][i]=arr[i][j];
                
            }
            
        }
        System.out.println("Transpose matrix -->");
        printarr(transpose);
        
    }
}     




public class SumofRow {
    public static void Sum_Row(int arr[][]){
        int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i==1){
        //             sum = sum+arr[i][j];
        //         }

        //     }
        // }
               //or
               for(int j=0;j<arr[0].length;j++){
                
                    sum = sum+arr[1][j];
                }

        System.out.println("sum of second row "+sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        Sum_Row(arr);
    }
}

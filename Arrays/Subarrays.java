public class Subarrays {
    public static void Sub_Array(int arr[]){
        int total=0;
        
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=0;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                System.out.print(arr[k]+ " ");
               }
              
                total++;
                System.out.println();
            }

            System.out.println("Total subarray"+total);
        }
       

    }
    public static void main(String[] args) {
        int arr []= {3,4,5,6,8};
        Sub_Array(arr);
    }
}

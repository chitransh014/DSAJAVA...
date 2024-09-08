

public class NumberCount {
    public static void Count(int arr[][]){
        int countof7=0;
          for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    countof7++;
                }
            }
          }
          System.out.println("count of 7 is "+countof7);
    }
    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,7}};
        Count(arr);
    }
}

public class SubArrraySum2 {
    public static void Sub_Array (int arr[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        //calculate the prefix array
        for(int i =1;i<prefix.length;i++){
            prefix[i] =prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j=start;j<arr.length;j++){
                int end =j;
                currSum=start ==0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum = " +maxSum);

    }
    public static void main(String[] args) {
        int arr[] = {5,8,-1,-2,9};
        Sub_Array(arr);
    }
}

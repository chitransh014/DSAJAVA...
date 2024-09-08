            // KADANES ALGORITHM

public class SubarraySum3 {
    public static void KADANES(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
}
System.out.println("Max subarray sum is = " +maxSum);
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,4,-3,8,-2};
        KADANES(arr);
    }
}

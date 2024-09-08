public class ReverseArray {
    public static void Reverse_Array(int arr[]){

        int first = 0;
        int end  = arr.length-1;
        while(first<end){
            int temp = arr[end];
            arr[end] = arr[first];
            arr[first] = temp;
            first++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[] = {4,6,9,2,10};
        Reverse_Array(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

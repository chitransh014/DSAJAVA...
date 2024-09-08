

public class FirstOccurance {

    public static int first_Occurance(int arr[],int key,int i){
        //base case
        if (i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
       return first_Occurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,4,8,5,3};
        System.out.println(first_Occurance(arr, 3, 0));
    }
}

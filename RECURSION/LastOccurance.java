

public class LastOccurance {

    public static int lastOccurance(int arr[],int i,int key){

        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, i+1, key);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,6,3,5,4};
        System.out.println(lastOccurance(arr, 0, 5));
    }
}

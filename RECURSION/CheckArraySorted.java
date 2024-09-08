
public class CheckArraySorted {

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1); // this call use for increment of the index of arr
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 6, 8 };

        
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(isSorted(arr, 0));
        
        System.out.println(isSorted(arr1, 0));
    }
}

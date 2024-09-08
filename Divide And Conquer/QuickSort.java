
public class QuickSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void QuickSort(int arr[], int si, int ei) {
        // base condition
        if (si >= ei) {
            return;
        }
        int pivotindx = partition(arr, si, ei);
        QuickSort(arr, si, pivotindx - 1);
        QuickSort(arr, pivotindx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for elements which smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;

        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5, 7, 1 };
        QuickSort(arr, 0, arr.length - 1);
        printArray(arr);

    }
}

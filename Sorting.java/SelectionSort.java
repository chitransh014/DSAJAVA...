public class SelectionSort {
    public static void Selection_Sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int minPos = turn;
            for (int j = turn + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {// for increasing order
                    // if(arr[minPos]<arr[j]) ------> for decreasing order

                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 5, 4 };
        Selection_Sort(arr);
        printArr(arr);
    }
}

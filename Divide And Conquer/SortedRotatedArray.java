
public class SortedRotatedArray {
    public static int Search(int arr[], int si, int ei, int tar) {

        // base case
        if (si > ei) {
            return -1;
        }
        // work
        int mid = si + (ei - si) / 2;

        // case found
        if (arr[mid] == tar) {
            return mid;
        }
        // mid on Line 1
        if (arr[si] <= arr[mid]) {
            // case a:left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return Search(arr, si, mid - 1, tar);
            } else {
                // case b:right
                return Search(arr, mid + 1, ei, tar);
            }
        }

        // mid on L2
        else {
            // case c: right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return Search(arr, mid + 1, ei, tar);
            } else {
                // case d:left
                return Search(arr, si, mid - 1, tar);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 0, 10, 8, 9 };
        int target = 7; // output
        int tarindx = Search(arr, 0, arr.length - 1, target);
        System.out.println(tarindx);
    }
}

import java.util.Collections;
import java.util.Arrays;
public class InbuiltSort {
    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 2, 3, 1, 5, 4 };
        //Arrays.sort(arr,0,3);
        Arrays.sort(arr,0,5,Collections.reverseOrder());
        printArr(arr);
    }
}

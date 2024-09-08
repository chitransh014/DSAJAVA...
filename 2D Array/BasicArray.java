import java.util.*;

public class BasicArray {
    public static boolean search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Found at cell(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;

    }

    public static void main(String args[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int arr[][] = new int[3][3];
        // intput
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                largest = Math.max(largest, arr[i][j]);
                smallest = Math.min(smallest, arr[i][j]);
                System.out.print(arr[i][j] + " ");

            }

            System.out.println();
        }
        System.out.println("largest element " + largest);
        System.out.println("smallest element " + smallest);
        search(arr, 11);
    }

}

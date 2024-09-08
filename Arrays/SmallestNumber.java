
public class SmallestNumber {

    public static int get_Smallest(int numbers[]) {

        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {

        int numbers[] = { 5, 10, 15, 3, 1, 8 };
        System.out.println("Smallest Number : " + get_Smallest(numbers));

    }

}

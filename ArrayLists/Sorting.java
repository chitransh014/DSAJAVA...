import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(2);

        System.out.println(list);
        // ascending order
        System.out.println("ascending order ==>");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Descending Order ==>");
        Collections.sort(list, Collections.reverseOrder());
        System.err.println(list);
        // comparator -fnx logic
    }

}

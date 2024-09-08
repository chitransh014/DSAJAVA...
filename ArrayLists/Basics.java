import java.util.ArrayList;
public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        

        //add element in list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0);
        System.out.println(list);
     
        //get operation
        int element = list.get(4);
        System.out.println(element);

        //remove element
        list.remove(2);
        System.out.println(list);

        //set element at any index
        list.set(2, 14);
        System.out.println(list);

        //contains
        System.out.println(list.contains(14));
        System.out.println(list.contains(20));
    }
}

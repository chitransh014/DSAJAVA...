
public class LinearSearch {
    public static int linear_search(int numbers[] , int key){

        for(int i = 0 ; i<numbers.length; i++){
            if(numbers[i] == key){

                return i;
            }
               
            }
            return -1;
        }

    
    public static void main(String args[]) {
        int  numbers[] = {4, 5 , 8 , 9 , 10 , 14 , 18};
        int key = 15;
        int index = linear_search(numbers, key);
        if(index == -1){
            System.out.println("Key is not in array");
        }else{
            System.out.println("key Is at index : "+index);
        }
        System.out.println();
    }
}

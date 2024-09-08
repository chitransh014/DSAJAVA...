

public class LargestNumbers {
    

    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<numbers.length ; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {5,10,15,3,1,8};
        System.out.println("Largest number : "+getlargest(numbers));
    }
}



public class Compare {
    public static void main(String[] args) {
        String str1 = "NIKHIL";
        String str2 = "NIKHIL";
        String str3 = new String("NIKHIL");
        // if(str1==str2){
        // System.out.println("Same value");

        // }else{
        // System.out.println("Different value");
        // }
        // if(str1==str3){
        // System.out.println("Same value");

        // }
        // System.out.println("Different value");
        //
        if (str1.equals(str3)) {
            System.out.println("Same value");
        } else {
            System.out.println("Different value");
        }
    }

}

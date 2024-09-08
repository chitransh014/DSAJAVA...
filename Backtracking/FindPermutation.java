public class FindPermutation {

    public static void Find_Permutation(String str , String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursiom
        for(int i=0;i<str.length();i++){
            char curr =str.charAt(i);
            //"abcde" =>"ab"+"de" ="abde"
            String Newstr =str.substring(0, i)+str.substring(i+1);
            Find_Permutation(Newstr, ans+curr);
        }

    }
    public static void main(String[] args) {
        String str = "abc";
        Find_Permutation(str, "");
    }
}

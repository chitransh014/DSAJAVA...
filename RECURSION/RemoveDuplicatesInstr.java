public class RemoveDuplicatesInstr {

    public static void RemoveDuplicates(String str,int indx,StringBuilder newStr,boolean map[]){

        if(indx==str.length()){
            System.out.println(newStr);
            return;
        }
        //work
        char currChar=str.charAt(indx);
        if(map[currChar -'a']==true){
            RemoveDuplicates(str, indx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            RemoveDuplicates(str, indx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str="nikhilverma";
        RemoveDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

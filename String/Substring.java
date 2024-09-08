

public class Substring {
    public static void Sub_String(String str,int si,int ei){
        String substr= "";
        for(int i=si;i<ei;i++){
            substr +=str.charAt(i);
            
        }
        System.out.println("substring "+substr);
    }
    public static void main(String[] args) {
        String str= "NIKHILVERMA";
        Sub_String(str, 0, 11);
    }
}

public class BinarytoDecimal {
    
        public static int bintoDecimal(int binNum){
            int myNum = binNum;
               int pow = 0;
                int decnum = 0;
                while(binNum>0){
                    int lastdigit = binNum%10;
                    decnum = decnum + (lastdigit*(int)Math.pow(2,pow)) ;
                    pow ++;
                    binNum = binNum/10;
                    
                }
                return decnum;
                  // or
                //System.out.println("decimal of "+myNum+ " = "+decnum);
        }
        public static void main(String args[]){
           //bintoDecimal(11011);
           int myNum = 10011; 
           System.out.print("decimal of "+myNum + " = "+ bintoDecimal(myNum));
          
        }
    }


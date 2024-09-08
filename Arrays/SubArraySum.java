public class SubArraySum {
   
        public static void Sub_ArraySum(int arr[]){
            int Currsum=0;
            int max = Integer.MIN_VALUE;
            
            for(int i=0;i<arr.length;i++){
                int start=i;
                for(int j=start;j<arr.length;j++){
                    int end=j;
                    Currsum=0;
                    for(int k=start;k<=end;k++){
                        Currsum +=arr[k];
                    
                   }
                   System.out.println("Sum of subarray " +Currsum );
                  
                    if(max<Currsum){
                        max = Currsum;
                    }
                }
    
                
            }
            System.out.println("MAximum sum of subarrays"+max);
           
    
        }
        public static void main(String[] args) {
            int arr []= {3,4,5,6,8};
            Sub_ArraySum(arr);
        }
    }
    


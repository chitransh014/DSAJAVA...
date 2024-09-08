public class GetSet {
    public static void main(String[] args) {
        Pen p1=new Pen();//created a pen object  called p1
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        p1.setTip(10);
        System.out.println(p1.getTip());
    }
}
    class Pen{
        private String color;
        private int tip;
        String getColor(){
            return this.color;
        }
        int getTip(){
            return this.tip;
        }
       void setColor(String newColor){
            this.color=newColor;
        }
        void setTip(int tip){
            this.tip=tip;
        }
    }


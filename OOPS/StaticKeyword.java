public class StaticKeyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="RLB";

        Student s2= new Student();
        System.out.println(s2.schoolName);
        // there is s2 has no schoolname that means it will print empty string but we use static keyword
        //to the reference of schoolname that'swhy s1 share method to the s2
    }
}
class Student{
    String name;
    int roll;

    //static keyword implementation
    static String schoolName;
    
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
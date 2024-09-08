
//    TYPE OF CONSTRUCTOR
public class Constructor1 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Nikhil");
        Student s3=new Student(24);
        System.out.println(s1.name);
        System.out.println(s3.rollno);
    }
}
class Student{
    String name;
    int rollno;

    //NON PARAMETERIZED CONSTRUCTOR
    Student (){
        System.out.println("Nikhil");
    }

    // PARAMETERIZED CONSTRUCTOR
    Student(String name){
        this.name=name;
    }
    // 
    Student(int rollno){
        this.rollno=rollno;
    }
}

public class CopyConstructor2 {
    
// TYPE OF CONSTRUCTOR

    public static void main(String[] args) {
         Student s1 = new Student("nikhil");
        
       //s1.name = "Nikhil";
        s1.rollno = 25;
        s1.marks[0] = 55;
        s1.marks[1] = 80;
        s1.marks[2] = 96;

        // copy studnet s1 detais into student s2
        Student s2 = new Student(s1);
        s1.marks[2] = 81;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
       

    }

}

class Student {
    String name;
    int rollno;
    int marks[];

    //DEEP COPY CONSTRUCTOR LINE 32 TO 37
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int rollno) {
        marks = new int[3];
        this.rollno = rollno;
    }
}



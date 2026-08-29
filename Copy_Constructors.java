public class Copy_Constructors {
    public static void main(String args[]) {

        Student s1 = new Student();

        s1.name = "Priya R C";
        s1.roll = 18;
        s1.password = "xyz";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 97;


        Student s2 = new Student(s1);
        s2.password = "abcd";
        s1.marks[2] = 91;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];
    
    class Address{
        String city;
    }
 //Shallow copy constructors
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }



    Student() {
        marks = new int[3];
        System.out.println("Constructor is called....");
    }

    Student(String name) {    
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
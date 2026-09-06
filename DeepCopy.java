public class DeepCopy {
    public static void main(String args[]) {

        Student s1 = new Student();

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 97;

        Student s2 = new Student(s1);

        s1.marks[2] = 91;

        System.out.println("Below are marks of s1");
        for(int i=0; i<3;i++){
            System.out.println(s1.marks[i]);
        }

        System.out.println("Below are marks of s2");
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    int marks[];

    // Deep copy constructor
    Student(Student s1) {
        marks = new int[3];

        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
    }
}
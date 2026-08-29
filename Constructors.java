public class Constructors{
    public static void main(String args[]){


        Student s2 = new Student();
        Student s1 = new Student("Priya");
        System.out.println(s1.name);
        Student s3 = new Student(19);
        System.out.println(s3.age);

    }

}
class Student{
    String name;
    int age;

    Student(){
        System.out.println("Constructor is called....");

    }

    Student(String name){
        this.name = name;
    }

    Student(int age){
        this.age = age;
        
    }
}


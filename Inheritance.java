public class Inheritance{
    public static void main(){

        Fish shark = new Fish();
            shark.eat();
    }
}

//Parent/base class
    class Animals{
        String name;
        String color;

        void eat(){
            System.out.println("eats");
        }

        void breathes(){
            System.out.println("They breathes");
        }
    }

//Derived/child class
    class Fish extends Animals{
        void swims(){
            System.out.println("They swim in water");
        }
    }

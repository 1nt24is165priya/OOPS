public class MulLine_Inheritance{
    public static void main(){
         Dogs raju = new Dogs();
         raju.eat();

         raju.legs=4;
         System.out.println(raju.legs);
        
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

//Derived/child class from Animals
    class Mammals extends Animals{
        int legs;
    }
//Derived/child class from Mammals
    class Dogs extends Mammals{
        String breed;
    }

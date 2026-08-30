public class Hierarchial_Inheritance{
    public static void main(){
         Fish f1 = new Fish();
         f1.eat();

         Mammals m1 = new Mammals();
         m1.breathes();

         Birds parrot = new Birds();
         parrot.eat();
        
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
        void mammals(){
            System.out.println("They give direct birth to their young ones");
        }
    }

    class Fish extends Animals{
        void fish(){
            System.out.println("swims");
        }
    }

    class Birds extends Animals{
        void birds(){
            System.out.println("Birds fly");
        }
    }
    

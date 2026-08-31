public class Method_Overloading {
    public static void main(String args[]) {

        //Method Overloading
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum((float) 1.5, (float) 2.5));
        System.out.println(calc.sum(3, 4, 8));


        //Method Overriding
        Deer d = new Deer();
        d.eat();
    }
}
    class Calculator {
        int sum(int a, int b) {
            return a + b;
        }
        float sum(float a, float b) {
            return a + b;
        }
        int sum(int a, int b, int c) {
            return a + b + c;
        }
    }

    class Animals{
        void eat(){
            System.out.println("eats anything");
        }
    }

    class Deer extends Animals{
        void eat(){
        System.out.println("eats grass");
        }
    }


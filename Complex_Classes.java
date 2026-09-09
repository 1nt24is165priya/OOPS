import java.util.Scanner;

public class Complex_Classes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input first complex number
        System.out.print("Enter real part of num1: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of num1: ");
        double i1 = sc.nextDouble();

        // Input second complex number
        System.out.print("Enter real part of num2: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of num2: ");
        double i2 = sc.nextDouble();

        Complex ans = new Complex();

        System.out.print("Sum: ");
        ans.addition(r1, i1, r2, i2);

        System.out.print("Difference: ");
        ans.subtraction(r1, i1, r2, i2);

        System.out.print("Product: ");
        ans.multiplication(r1, i1, r2, i2);

    
    }
}

class Complex {
    void addition(double r1, double i1, double r2, double i2) {
        double real = r1 + r2;
        double imag = i1 + i2;
        System.out.println(real + " + " + imag + "i");
    }

    void subtraction(double r1, double i1, double r2, double i2) {
        double real = r1 - r2;
        double imag = i1 - i2;
        System.out.println(real + " + " + imag + "i");
    }

    void multiplication(double r1, double i1, double r2, double i2) {
        double real = (r1 * r2) - (i1 * i2);
        double imag = (r1 * i2) + (i1 * r2);
        System.out.println(real + " + " + imag + "i");
    }
}

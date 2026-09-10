// Base class 
class Automobile { 
    // Private method (not visible to child classes) 
    private String drive() { 
        return "Driving vehicle"; 
    } 
} 
 
// Child class 
class Car extends Automobile { 
    // New method (not overriding Automobile's private method) 
    protected String drive() { 
        return "Driving car"; 
    } 
} 
 
// Grandchild class 
public class ElectricCar extends Car { 
    // Correct override of Car's drive() method 
    @Override 
    public final String drive() { 
        return "Driving electric car"; 
    } 
 
    public static void main(String[] wheels) { 
        final Car car = new ElectricCar();   // Polymorphism: Car reference, ElectricCar object 
        System.out.print(car.drive());       // Calls ElectricCar's drive() 
    } 
} 

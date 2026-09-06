public class Abstract_Constructors{
    public static void main(String args[]){

        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        chicken c = new chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
    
        Mustang myHorse = new Mustang();

    }
}

abstract class Animals{
    String color;

    Animals(){
        color="brown";
        System.out.println("Animal Constructor is called");
    }
    void eat(){
        System.out.println("animals eat");
    }

    abstract void walk();
}

class Horse extends Animals{

    Horse(){
        System.out.println("Horse constructor is called");
    }

    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
    
}

class Mustang extends Horse{

    Mustang(){
        System.out.println("Mustang Constructor is called");
    }
}

class chicken extends Animals{

    chicken(){
        System.out.println("Chicken constructor is called");
    }

    void changeColor(){
        color="Yellow";
    }
    void walk(){
        System.out.println("chicken wlaks on 2 legs");
    }
}
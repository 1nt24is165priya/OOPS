public class Abstract_Classes{
    public static void main(String args[]){

        Horse h = new Horse();
        h.eat();
        h.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animals{
    void eat(){
        System.out.println("animals eat");
    }

    abstract void walk();
}

class Horse extends Animals{
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
    
}

class chicken extends Animals{
    void walk(){
        System.out.println("wlaks on 2 legs");
    }
}
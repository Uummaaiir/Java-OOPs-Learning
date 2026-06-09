package abstraction;

abstract class Car{

    public abstract void drive();
    public  abstract void fly();

    public void music(){
        System.out.println("Music play");
    }
}

 abstract class wagonR extends Car{
    public void drive(){
        System.out.println("Car is Running...");
    }

}

class updateWagonr extends wagonR{
    public void fly(){
        System.out.println("Flying...");
    }
}

public class demo {
    public static void main() {

        Car c1 = new updateWagonr();

        c1.music();
        c1.drive();
        c1.fly();
    }
}

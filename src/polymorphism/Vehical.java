package polymorphism;

public class Vehical {

    void start(){
        System.out.println("vehical is starting ...");
    }

    void speed(int speed){
        System.out.println("Speed: "+speed);
    }

    void speed(int speed, String unit){
        System.out.println("Speed: " + speed + " " + unit);
    }
}

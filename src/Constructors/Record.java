package Constructors;

record Bike(String brand, int speed){}

public class Record {
    public static void main(String[] args){

        Bike bike = new Bike("Bmw", 500);
        System.out.println("Brand: "+bike.brand());
        System.out.println("speed: "+ bike.speed());

        System.out.println(bike);
    }
}

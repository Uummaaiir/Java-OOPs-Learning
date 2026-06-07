package inheritance;

public class car extends vehical{

    private int door;

    public car(String brand, int speed){
        super(brand, speed); // super keyword is used when Child class wants to pass the value to the parent class and in the parent class parameter is private


    }

    public void displayInfo(){
        System.out.println("brand: "+ getBrand()+ " speed: "+ getSpeed());
    }
}

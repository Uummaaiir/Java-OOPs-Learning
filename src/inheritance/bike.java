package inheritance;

public class bike extends vehical {

    public bike(String brand , int speed){
        super(brand, speed);
    }

    public void displayInfo(){
        System.out.println("brand: "+ getBrand()+ " speed: "+ getSpeed());
    }

}

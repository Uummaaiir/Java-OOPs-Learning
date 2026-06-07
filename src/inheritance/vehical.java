package inheritance;

public class vehical {
   public String brand;
    public int speed;

    public vehical( String brand,int speed) {
        this.speed = speed;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

//    public void displayInfo(){
//        System.out.println("brand: "+brand+ " speed: "+speed);
//    }
}

package polymorphism;

public class DemoPoly {

   public  static void main(String[] args) {
       Vehical v1 = new car();
       Vehical v2 = new Bike();

       v1.start();
       v2.start();

       Vehical v3 = new Vehical();

       v3.speed(100);
       v3.speed(120,"km/h");




    }

}

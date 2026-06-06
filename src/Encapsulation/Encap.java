package Encapsulation;

public class Encap {

    // Encapsulation: private variable (data hiding)
    private String name;

    // Setter Method
    public void setName(String name) {
        this.name = name;
    }

    // Getter Method
    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        // Creating object
        Encap s1 = new Encap();

        // Setting value using setter
        s1.setName("Umair");

        // Getting value using getter
        System.out.println("Student Name: " + s1.getName());
    }
}

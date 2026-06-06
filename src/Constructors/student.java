package Constructors;

public class student {

    String name;
    int age;

     public student(String a , int b){
        name = a;
        age  = b;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

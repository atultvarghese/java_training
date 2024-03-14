package com.example.java_lib.abstraction;



interface Interface1{
    default void atulC(){
        System.out.println("Atul");
    }
}
interface Interface2 {
    default void amal(){
        System.out.println("Amal");
    };

    void abstractClass();
}

class Bike implements Interface1, Interface2 {

    @Override
    public void abstractClass() {
        System.out.println("This needs to be implemented");
    }

}

public class Inteface {

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.amal();
        bike.atulC();
        bike.abstractClass();
    }
}




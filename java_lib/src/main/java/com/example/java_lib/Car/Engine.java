package com.example.java_lib.Car;

public class Engine {
    Integer hp;
    String fuel_type;
    Engine(Integer hp, String fuel_type){
        this.hp = hp;
        this.fuel_type = fuel_type;
        System.out.println("Engine set");
    }

}

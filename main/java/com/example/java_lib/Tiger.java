package com.example.java_lib;

public class Tiger {

    int legs = 0;

    Tiger() {
        System.out.println("This is Tiger");
    }

    Tiger(String city, int legs) {
        System.out.println("Tiger is from " + city);
        this.legs = legs;
    }

    void tigerEating() {
        System.out.println("Tiger is eating and having " + legs + " legs");
    }

    int tigerEating(int id) {
        System.out.println("Tiger is eating and having " + legs + " legs");
        return id + 1;
    }
}

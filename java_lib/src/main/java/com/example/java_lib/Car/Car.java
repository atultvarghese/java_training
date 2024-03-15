package com.example.java_lib.Car;

public class Car {

    Car(Engine engine, Wheel wfl, Wheel wfr, Wheel wbl, Wheel wbr){
        System.out.println("This a car with engine having "+ engine.hp +" HP and"
        + wfl.size + "Wheel size");
    }

    void start(){
        System.out.println("Car Started");
    }
    void stop(){
        System.out.println("Engine stops");
    }

    void changeFlatTyre(){
        System.out.println("Changed flat tyre");
    }


    public static void main(String[] args) {
        Engine engine = new Engine(8, "petrol");
        Wheel wheel_front_left = new Wheel(10);
        Wheel wheel_front_right = new Wheel(10);
        Wheel wheel_back_left = new Wheel(10);
        Wheel wheel_back_right = new Wheel(10);
        Car alto = new Car(engine, wheel_front_left, wheel_front_right, wheel_back_left, wheel_back_right);
        alto.start();
        alto.changeFlatTyre();
        alto.stop();

        Wheel polo_wheel_front_left = new Wheel(15);
        Wheel polo_wheel_front_right = new Wheel(15);
        Wheel polo_wheel_back_left = new Wheel(15);
        Wheel polo_wheel_back_right = new Wheel(15);
        Car polo = new Car(engine, polo_wheel_front_left, polo_wheel_front_right, polo_wheel_back_left, polo_wheel_back_right);
        polo.start();
        polo.changeFlatTyre();
        polo.stop();



    }
}

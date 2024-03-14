package com.example.java_lib.temp;
interface MyInterface{
    void abstractFunction(int a);
}
public class Lambda {
    public static void main(String[] args) {
        MyInterface myInterface = (x) -> {
            System.out.println(x * x);
            System.out.println(x + x);
        };
        myInterface.abstractFunction(10);

    }
}

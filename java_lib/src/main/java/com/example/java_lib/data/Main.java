package com.example.java_lib.data;

import com.example.java_lib.model.view.View;

class A {
    A(Integer age){
        System.out.println("Age is "+age);
    }
}

class B extends A {
    B(Integer age, String place){
        super(age);
        System.out.println("The age is "+ age + " place is " +place);
    }

}

public class Main {


    public static void main(String[] args){
        System.out.println("Iam Main");

        /*View view = new View();
        view.callMe();*/

        B b = new B(12,"Bangalore");
    }
}

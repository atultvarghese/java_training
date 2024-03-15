package com.example.java_lib;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MyClass {
    /*String myname = "Atul";
    void playing(String name) {
        System.out.println(name + " is Playing outside");

    }*/
    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Name");
        String user = obj.nextLine();
        System.out.println(user);*/

        /*
        int[] arr = {1,2,3,4,5};
        for (int i=0; i <= arr.length-1; i++){
            System.out.println("My index is " + i + " my value is " + arr[i]);
        }

        for (int i : arr){
            System.out.println("Value :" + i);
        }
        */

        //    Take input from users and store it in an array
        //    check weather the name exists in the list
        //    if already exists inform user
        //    if user type exit -- stop the iteration

        /*ArrayList<String> names = new ArrayList<>();
        while (true) {
            Scanner name = new Scanner(System.in);
            System.out.println("Enter the name:");
            String data = name.nextLine();
            if (data.equals("exit")) {
                for (String n : names) {
                    System.out.println(n);
                }
                break;
            } else {
                boolean if_not_exits = true;
                for (String element : names) {
                    if (data.equals(element)) {
                        if_not_exits = false;
                        System.out.println("Name Already present");
                        break;
                    }
                }
                if (if_not_exits) {
                    names.add(data);
                }
            }
        }
        for (String n : names) {
            System.out.println("Names present " + n);
        }*/
//
//        MyClass my_class = new MyClass();
//        my_class.playing(my_class.myname);
//        System.out.println(my_class.myname);


        //  Example for constructor over loading
//        Tiger tiger = new Tiger("Calicut", 4);
//        tiger.tigerEating(1);
//        tiger.tigerEating();


        /*below thing in oop way of above.
        ArrayExample arrayExample = new ArrayExample();
        arrayExample.run();*/
    }
}
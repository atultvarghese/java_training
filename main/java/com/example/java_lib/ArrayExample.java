package com.example.java_lib;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExample {


    void run() {
        while (true) {
            String data = readData();
            if (checkExits(data)) {
                break;
            }
            if (checkContains(data)) {
                System.out.println("Data already present");
            } else {
                addData(data);
            }
        }
        showNames();
    }

    ArrayList<String> names = new ArrayList<>();

    String readData() {
        System.out.println("Enter the name:");
        Scanner data = new Scanner(System.in);
        return data.nextLine();
    }

    boolean checkExits(String data) {
        return data.equals("exit");

    }

    boolean checkContains(String data) {
        for (String element : this.names)
            if (data.equals(element)) {
                return true;
            }
        return false;

    }

    void addData(String value) {
        this.names.add(value);
    }

    void showNames() {
        for (String name : this.names) {
            System.out.println(name);
        }
    }

}


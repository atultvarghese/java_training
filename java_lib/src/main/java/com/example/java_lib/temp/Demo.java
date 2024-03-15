package com.example.java_lib.temp;

public class Demo {

    interface MyInterFace {
        int addNum(int a, int b);
    }

    interface ShowInterFace {
        int addNum(int a, int b);
    }

    public static void main(String[] args) {
        System.out.println("HI");
    }


    Demo.MyInterFace myadd = (int a, int b) -> a+b;
    Demo.MyInterFace myMul = (int a, int b) -> a*b;
}

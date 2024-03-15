package com.example.java_lib.temp;

import java.util.ArrayList;


public class ArraySort {

    interface MaxElem{
        int findMaxEle(int value, int max);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(7);
        arr.add(3);

        MaxElem maxElem = new MaxElem() {
            @Override
            public int findMaxEle(int value, int max) {
//                max = Math.max(value, max);
                return Math.max(value, max);

            }
        };

        int max_value = arr.get(0);
//        arr.forEach(item -> maxElem.findMaxEle(item, max_value));

        for (int item : arr){
            max_value = maxElem.findMaxEle(item, max_value);
        }

        System.out.println(max_value);




    }

}

package com.example.java_lib.temp.accessments;

import java.util.ArrayList;

/*
* 1. Find the largest element in Arraylist
2. Sort the Array list
3. Remove duplicate elements from array list
4. count the occurence of an element in the arraylist
5. Remove all strings with odd length from array list
* */

public class ArrayOperations {


    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(12);
        arrayList.add(1);
        arrayList.add(30);
        arrayList.add(12);
        arrayList.add(45);

        int max_elem = arrayList.get(0);

        for (int elem : arrayList){
           if (elem > max_elem){
               max_elem = elem;
           }
        }
        System.out.println("Max Elem in the list is :" + max_elem);


        for (int i = 0; i < arrayList.size(); i++) {

            for (int j = arrayList.size() - 1; j > i; j--) {
                if (arrayList.get(i) > arrayList.get(j)) {

                    int tmp = arrayList.get(i);
                    arrayList.set(i,arrayList.get(j)) ;
                    arrayList.set(j,tmp);

                }

            }

        }
        System.out.println("Sorted Array: ");
        for (int i: arrayList) {
            System.out.println(i);
        }



    }
}

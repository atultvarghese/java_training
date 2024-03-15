package com.example.java_lib.temp;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DataTypes {

    static boolean checkUniqueId(ArrayList<Map> array, int id){
        for (Map val : array){
            if (val.get("id").equals(id)){
                System.out.println("You have entered a same id so please enter a unique id: ");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        /*List<Integer> myList = new ArrayList<Integer>();
        myList.add(13);
        myList.add(6);
        myList.add(6);
        myList.add(6);
        myList.add(6);
        myList.add(6);
        myList.add(1, 17);

        Collections.sort(myList);

        ListIterator<Integer> listIterator = myList.listIterator();

        while (listIterator.hasNext()){
//            System.out.println(listIterator.previous());
            System.out.println("List with index "+ listIterator.nextIndex() +"having "+ listIterator.next());
        }*/



        /*Map myMap = new HashMap();
        myMap.put("name", "Atul");
        myMap.put("designation", "SWE");

        Set mySet = myMap.entrySet();
        Iterator iteratorSet = mySet.iterator();

        System.out.println("My Map "+myMap);
        while (iteratorSet.hasNext()){
            Map.Entry entry = (Map.Entry)iteratorSet.next();
            System.out.println("key :" + entry.getKey() + " Value : " + entry.getValue());
        }*/


        ArrayList<Map> data = new ArrayList<>();

        while (true){
            Map dict = new LinkedHashMap();
            System.out.println("---------- DATA ENTRY ---------");
            System.out.println("Enter the name:");
            Scanner in = new Scanner(System.in);
            String name = in.nextLine();
            dict.put("name", name);

            System.out.println("Enter the ID:");
            int id = in.nextInt();

            while (!(checkUniqueId(data, id))) {
                id = in.nextInt();
            }

            dict.put("id", id);

            System.out.println("Enter the PW:");
            int pass = in.nextInt();
            dict.put("pass", pass);

            System.out.println("do you want to add new data (y/n)");
            Scanner check = new Scanner(System.in);
            String cont = check.nextLine();


            data.add(dict);
            if (cont.equals("n")) {
                break;
            }


        }
        System.out.println("Data Base contains :");
        for (Map val : data){
            System.out.println("ID : "+ val.get("id") +" Name : " +val.get("name") );
        }


    }


}

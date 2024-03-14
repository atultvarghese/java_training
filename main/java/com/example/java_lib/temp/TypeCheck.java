package com.example.java_lib.temp;

public class TypeCheck {


    int num = 13;
    Integer newnum = num;

    int typecastnum = num;

    String name = "123";
    String name2 = "123";

    int sint = Integer.parseInt(name);

    char[] ch={'j','a','v','a','t','p','o','i','n','t'};
    String s = new String(ch);

    String upper = s.toUpperCase();



    public static void main(String[] args) {
        System.out.println("Atul");
        TypeCheck tc = new TypeCheck();

        StringBuilder myName = new StringBuilder("Atultvarghese");
        myName.setCharAt(4, 'x');

        System.out.println(myName);


        String newName = "Atultv";
        newName = newName.substring(0,4)+'x'+newName.substring(5);
//        System.out.println(tc.upper);
        System.out.println(newName);

        System.out.println(newName.getBytes());


    }

}

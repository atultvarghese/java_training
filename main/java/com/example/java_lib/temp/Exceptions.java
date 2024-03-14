package com.example.java_lib.temp;

public class Exceptions {

    void errorFn(){
        int a = 10;
        int b = 0;
        int res = a/b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int res = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occurred " + e);
        } finally {
            System.out.println("First part completed");
        }

        int[] myarr = new int[5];

        try {
            System.out.println(myarr[10]);
        } catch (Exception e){
            System.out.println("Exception :" + e);
        }
        finally {
            System.out.println("End of the Program");
        }

    }
}

class Propagation extends Exceptions {
    public static void main(String[] args) {
        Propagation propagation = new Propagation();
        propagation.errorFn();
    }
}

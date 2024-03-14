package com.example.java_lib;

import java.util.Scanner;
import java.util.UUID;

public class Banking {
    String acc_holder_name;
    String acc_num;
    Float balance;
    Banking(String acc_holder_name, Float balance){
         this.acc_holder_name = acc_holder_name;
         this.acc_num  = UUID.randomUUID().toString();;
         this.balance = balance;
    }

    void withDraw(Float amt){
        this.balance = this.balance - amt;
        System.out.println("Withrawed Amt "+ amt + " Current Balance "+ this.balance);
    }

    void checkBalance(){
        System.out.println("Your account balance is "+ this.balance);
    }

    void deposit(Float amt){
        this.balance = this.balance + amt;
        System.out.println("You have deposited "+ amt + " rupees and your current balance is rs."+ this.balance);
    }

    void deposit(){
        Scanner amtobj = new Scanner(System.in);

        Float amt = amtobj.nextFloat();
        this.balance = this.balance + amt;
        System.out.println("You have deposited "+ amt + " rupees and your current balance is rs."+ this.balance);
    }

    void getAccNumber(){
        System.out.println("Your Account Number is "+ this.acc_num);
    }

    public static void main(String[] args){
        Banking atuls_act = new Banking("Atul", 10.2F);
        atuls_act.withDraw(1.2F);
        atuls_act.checkBalance();
        // atuls_act.deposit(100000F);
        atuls_act.deposit();
        atuls_act.getAccNumber();
        atuls_act.checkBalance();
    }
}

package com.example.java_lib.abstraction;

abstract public class Company {

    abstract void companyId();

    abstract void govId();

    void lunch(){
        System.out.println("Had lunch here in office");
    }

    public static void main(String[] args) {
        Company company = new Company() {

            void companyId() {
                System.out.println("ID");
            }
            public void govId() {
                System.out.println("govID");
            }
        };
        company.companyId();
    }
}



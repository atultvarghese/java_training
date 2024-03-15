package com.example.java_lib;
import java.lang.instrument.Instrumentation;

public class ObjSize {
        private static Instrumentation instrumentation;

        public static void premain(String args, Instrumentation inst) {
            instrumentation = inst;
        }

        public static long getObjectSize(Object o) {
            return instrumentation.getObjectSize(o);
        }

    public static void main(String[] args) {
        String name = "Atul";
        long size = ObjSize.getObjectSize(name);
        System.out.println(size);
    }
}




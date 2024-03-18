package com.example.java_lib.temp;
// Java program to demonstrate
// the use of stream in java
import java.util.*;
import java.util.stream.*;

public class SteamExaple {
        public static void main(String args[])
        {
            // create a list of integers
            List<Integer> number = Arrays.asList(2, 3, 4, 5);

            // demonstration of map method
            List<Integer> square
                    = number.stream()
                    .map(x -> x * x)
                    .toList();

            // create a list of String
            List<String> names = Arrays.asList(
                    "Reflection", "Collection", "Stream");

            // demonstration of filter method
            List<String> result
                    = names.stream()
                    .filter(s -> s.startsWith("S"))
                    .collect(Collectors.toList());

            System.out.println(result);

            // demonstration of sorted method
            List<String> show
                    = names.stream()
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println(show);

            // create a list of integers
            List<Integer> numbers
                    = Arrays.asList(2, 3, 4, 5, 2);

            // collect method returns a set
            Set<Integer> squareSet
                    = numbers.stream()
                    .map(x -> x * x)
                    .collect(Collectors.toSet());

            System.out.println(squareSet);

            // demonstration of forEach method
            number.stream()
                    .map(x -> x * x)
                    .forEach(y -> System.out.println(y));

            // demonstration of reduce method
            int even
                    = number.stream()
                    .filter(x -> x % 2 == 0)
                    .reduce(0, (ans, i) -> ans + i);

            System.out.println(even);

            List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

            List<Integer> squre = list.stream()
                    .map(x -> x * x)
                    .toList();

            System.out.println(squre);


            Map map = new HashMap();

            map.put("id", 1);
            map.put("value", 2);
            System.out.println(map);
//            map.entrySet().stream()
//                    .map(entry -> en + 1 )
//                    .toList();
//                    .forEach(System.out::println)


        }

}

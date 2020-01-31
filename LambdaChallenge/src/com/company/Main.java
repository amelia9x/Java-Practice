package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        new Thread(runnable).start();

        Function<String, String> lambdaString = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

//        String takeValue = lambdaString.apply("Kaifevu Aoneh");
//        String source = "1234567890";
//        System.out.println(everySecondCharacter(lambdaString, source));
//
//        Supplier<String> iLoveJava = () -> {
//            return "I love Java!";
//        };
//        String supplierResult = iLoveJava.get();
//        System.out.println(supplierResult);

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );


        List<String> sortTopNames2015 = new ArrayList<>();
        topNames2015.forEach(s -> {
            sortTopNames2015.add(s.substring(0, 1).toUpperCase() + s.substring(1));
        });

//        Collections.sort(sortTopNames2015, (s1, s2) -> s1.compareTo(s2));
//        sortTopNames2015.sort((s1, s2) -> s1.compareTo(s2));
//        sortTopNames2015.sort(String::compareTo); // Minh chua quen cach nay

//        sortTopNames2015.forEach(s -> System.out.println(s));
//        sortTopNames2015.forEach(System.out::println);

//        topNames2015.stream()
//                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
//                .sorted(String::compareTo)
//                .forEach(System.out::println);

//        long namesBeginWithA = topNames2015
//                .stream()
//                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
//                .filter(s -> s.startsWith("A"))
//                .count();
//
//        System.out.println("Number of names beginning with A is: " + namesBeginWithA);

        topNames2015
                .stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring((1)))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());

//                .filter(s -> s.startsWith("A"))
//                .forEach(System.out::println);

    }

    public static String everySecondCharacter(Function<String, String> lambdaString, String source) {
        String takeValue = lambdaString.apply(source);
        return takeValue;
    }
}

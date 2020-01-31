package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g43",
                "I26", "I17", "I29",
                "O71");

        List<String> gNumbers = new ArrayList<>();

//        someBingoNumbers.forEach(number -> {
//            if(number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//
////        Collections.sort(gNumbers, (number1, number2) -> number1.toUpperCase().compareTo(number2.toUpperCase()));
////        gNumbers.sort((number1, number2) -> number1.compareTo(number2));
//        gNumbers.sort(String::compareTo);
//        gNumbers.forEach(number -> System.out.println(number));

        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

//        "I26", "I17", "I29", "071"
//        "N40", "N36", "I26", "I17", "I29", "071"
//        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "071");
//        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "071");
//        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
//
//        System.out.println(concatStream
//                .distinct()
//                .peek(System.out::println)
//                .count());


        Employee john = new Employee("John Smith", 37);
        Employee kate = new Employee("Kate McKen", 22);
        Employee hikaru = new Employee("Hikari Tanaka", 28);
        Employee anh = new Employee("Anh Nguyen", 25);
        Employee hana = new Employee("Hana Tanaka", 35);
        Employee luca = new Employee("Luca Sarada", 32);

        List<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(new Employee[] {john, kate, hikaru, anh, hana, luca}));

        Department hr = new Department("Human Resources");
        hr.addEmployee(john);
        hr.addEmployee(kate);
        hr.addEmployee(hana);
        hr.addEmployee(luca);
        Department dev = new Department("Developer");
        dev.addEmployee(hikaru);
        dev.addEmployee(anh);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(dev);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

//        List<String> sortedGNumbers = someBingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("G"))
//                .sorted()
//                .collect(Collectors.toList());

        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for(String s : sortedGNumbers) {
            System.out.println(s);
        }

        System.out.println("***********************************");

//        Map<Integer, List<Employee>> groupedByAge = departments.stream()
//                .flatMap(department -> department.getEmployees().stream())
//                .collect(Collectors.groupingBy(employee -> employee.getAge()));
//
//        for(Integer i : groupedByAge.keySet()) {
//            System.out.println(i);
//            System.out.println(groupedByAge.get(i).get(0));
//        }

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e2 : e1)
                .ifPresent(System.out::println);

        Stream.of("ABC", "AC", "BAA", "CCCC", "XY", "ST")
                .filter(s -> {
                    System.out.println(s);
                    return s.length() == 3;
                })
                .peek(s -> {
                    System.out.println("=========");
                    System.out.println(s);
                }).count();
    }
}

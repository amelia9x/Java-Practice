package com.company_static;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares, and " + cubes.size() + " cubes.");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("There are " + union.size() + " elements in union.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("There are " + intersection.size() + " elements in intersection.");
        for(int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentences = "one day in the year of pig";
        String[] arrayWords = sentences.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        System.out.println("Nature - Divine");
        printSet(diff1);

        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        System.out.println("Divine - Nature");
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);

        Set<String> intersectionTest = new HashSet<>(nature);
        intersection.retainAll(divine);

        System.out.println("Symmetric different: ");
        unionTest.removeAll(intersection);
        printSet(unionTest);

        if(nature.containsAll(divine)) {
            System.out.println("Divine is subset of Nature");
        }

        if(nature.containsAll(intersection)) {
            System.out.println("Intersection is subset of Nature");
        }

        if(divine.containsAll(intersection)) {
            System.out.println("Intersection is subset of Divine");
        }

    }

    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for(String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}


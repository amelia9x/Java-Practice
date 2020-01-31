package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    String challenge1 = "I want a bike.";
	    String challenge2 = "I want a ball.";
	    String regExp = "I want a \\w+.";
        System.out.println(challenge1.matches(regExp));
        System.out.println(challenge2.matches(regExp));

        String regExp1 = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));

        String regExp2 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp2);
        Matcher challenge1Matcher = pattern.matcher(challenge1);
        System.out.println(challenge1Matcher.matches());

        Matcher challenge2Matcher = pattern.matcher(challenge2);
        System.out.println(challenge2Matcher.matches());

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s", "_"));

        String challenge5 = "aabccccccccdddefffg";
//        String regExp5 = "a+b*c+d+e*f+g*";
//        String regExp5 = "[abcdefg]+";
//        String regExp5 = "[abcdefg]*";
        String regExp5 = "[a-g]+";

        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println(challenge5.replaceAll("^a{3}bc{8}d{3}ef{3}g$", "REPLACED"));

        pattern = Pattern.compile(regExp5);
        Matcher matcher = pattern.matcher(challenge5);
//        System.out.println(matcher.matches());

        String challenge7 = "abcd.135";
//        String regExp7 = "\\w+.\\d+";
        String regExp7 = "^[A-z]+\\.\\d+$";
        System.out.println(challenge7.matches(regExp7));

        String challenge8 = "abcd.135uvqz.7tZik.999";
        Pattern pattern8 = Pattern.compile("(([A-z]+)\\.)(\\d+)");
        Matcher matcher8 = pattern8.matcher(challenge8);

        matcher8.reset();
        int count = 0;
        while (matcher8.find()) {
            System.out.println("Count " + count++ + ", start: " +
                    matcher8.start(1) + " and end: " + matcher8.end(1) +
                    " and value: " + matcher8.group(1));
        }
        System.out.println("===========================");

        String challenge9 = "abcd.135\tuvqz.7\ttZik.999\n";
        Pattern pattern9 = Pattern.compile("[A-z]+\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);

        count = 0;
        while (matcher9.find()) {
            System.out.println("Count " + count++ + ", start: " +
                    matcher9.start(1) + " and end: " + (matcher9.end(1) - 1) +
                    " and value: " + matcher9.group(1));
        }
        System.out.println("===========================");

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x, y}, {11, 12}";
//        String regExp11 = "\\{(\\d\\,\\s\\d)\\}\\,*";
        String regExp11 = "\\{(\\d+, \\d+)\\}";
//        String regExp11 = "\\{(.+?)\\}";
        Pattern pattern11 = Pattern.compile(regExp11);
        Matcher matcher11 = pattern11.matcher(challenge11);

        count = 0;
        while (matcher11.find()) {
            System.out.println("Count " + count++ + ", start: " +
                    matcher11.start(1) + " and end: " + (matcher11.end(1) - 1) +
                    " and value: " + matcher11.group(1));
        }
        System.out.println("===========================");

        String challenge12 = "11111";
        String regExp12 = "^\\d{5}$";

        System.out.println(challenge12.matches(regExp12));

        String challenge13 = "11111-1111";
        String regExp13 = "^\\d{5}-\\d{4}$";

        System.out.println(challenge13.matches(regExp13));

        System.out.println(challenge12.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge13.matches("^\\d{5}(-\\d{4})?$"));
    }
}

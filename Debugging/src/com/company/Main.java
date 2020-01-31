package com.company;

public class Main {

    public static void main(String[] args) {
        StringUtilities utility = new StringUtilities();
        StringBuilder sb = new StringBuilder();

        while(sb.length() < 10) {
            utility.addChar(sb, 'a');
        }
        System.out.println(sb);

        String str = "abcdefg";
        String result = utility.upperAndPrefix(utility.addSuffix(str));
    }
}

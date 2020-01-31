package com.company;

public class Main {

    public static void main(String[] args) {
	int a = 3;
	if(a == 1) {
        System.out.println("It was 1");
    }
	else if(a == 2) {
            System.out.println("It was 2");
        }
	else {
            System.out.println("It wasn't 1 or 2");
        }

	int b = 4;
	switch (b){
        case 1:
            System.out.println("It was 1");
            break;

        case 2:
            System.out.println("It was 2");
            break;

        case 3: case 4: case 5:
            System.out.println("It was 3 or 4 or 5");
            System.out.println("It actually is " + b);
            break;

        default:
            System.out.println("It is out of range from 1 to 5");
            break;
    }

    char charVariable = 'G';
	switch (charVariable) {
        case 'A':
            System.out.println("This is A character");
            break;

        case 'B':
            System.out.println("This is B character");
            break;
            
        case 'C': case 'D': case 'E':
            System.out.println("This is " + charVariable + " character");
            break;

        default:
            System.out.println("Not found suitable character");
            break;
            
    }

    String month = "JanUAry";
	switch(month.toUpperCase()) {
        case "JANUARY":
            System.out.println("Jan");
            break;

        case "JUNE":
            System.out.println("Jun");
            break;

        default:
            System.out.println("Not sure");
            break;
    }

    }
}

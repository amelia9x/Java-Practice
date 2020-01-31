package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("9090 8989 7878");

    public static void main(String[] args) {
        boolean quit = false;
        int action = 0;
        startDevice();
        printActionList();

        while(!quit) {
            System.out.print("Please enter action number: ");
            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActionList();
                    break;
            }
        }
    }

    private static void startDevice() {
        System.out.println("Starting phone...");
    }

    private static void printActionList() {
        System.out.println("Below is action list. Press: ");
        System.out.println("0 - to shut down.\n" +
                "1 - to print out phone list.\n" +
                "2 - to add new contact.\n" +
                "3 - to update existing contact.\n" +
                "4 - to remove existing contact.\n" +
                "5 - to query existing contact.\n" +
                "6 - to print out action list.\n");
    }

    private static void addNewContact() {
        System.out.println("Input contact name: ");
        String name = scanner.nextLine();

        System.out.println("Input contact number: ");
        String number = scanner.nextLine();

        Contact contact = Contact.createContact(name, number);
        if(mobilePhone.addContact(contact)) {
            System.out.println("Contact with " + contact.getName() + " is added in phone list.");
        }
    }

    private static void updateContact() {
        System.out.println("Input contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name); // Nên để ở 75 thay vì 80
        if(existingContact == null) {
            System.out.println(name + " not found in contact list.");
        }
        else {
            System.out.println("Input new contact name: ");
            String newName = scanner.nextLine();
            System.out.println("Input new contact number: ");
            String newNumber = scanner.nextLine();
            Contact newContact = Contact.createContact(newName, newNumber);
            if (mobilePhone.updateContact(existingContact, newContact)) {
                System.out.println("Successfully updated.");
            }
            else {
                System.out.println("Error when updating");
            }
        }
    }

    private static void removeContact() {
        System.out.println("Input contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name); // Nên để ở 75 thay vì 80
        if(existingContact == null) {
            System.out.println(name + " not found in contact list.");
        }
        else {
            if(mobilePhone.removeContact(existingContact)) {
                System.out.println("Successfully deleted.");
            }
            else {
                System.out.println("Error when deleting");
            }
        }
    }

    private static void queryContact() {
        System.out.println("Input contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println(name + " not found in contact list.");
        } else {
            System.out.println("Name: " + existingContact.getName() + " , number: " + existingContact.getNumber());
        }
    }
}

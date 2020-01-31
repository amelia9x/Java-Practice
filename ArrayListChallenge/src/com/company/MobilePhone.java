package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) { // cần .getName()
            System.out.println("The contact was already in phone list.");
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact); // Nên khai báo biến cho findContact(oldContact)
        if(position < 0) {
            System.out.println("The contact " + oldContact.getName() +" is not in phone list.");
            return false;
        }
        else if (findContact(newContact.getName()) >= 0) {
            System.out.println("The contact " + newContact.getName() + " was already in phone list. Fail to update");
            return false;
        }
        else {
            myContacts.set(position, newContact);
            System.out.println("The contact " + oldContact.getName() +" is replaced with " + newContact.getName());
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact); // Nên khai báo biến cho findContact(contact)
        if(position < 0) {
            System.out.println("The contact " + contact.getName() +" is not in phone list.");
            return false;
        }
        else {
            this.myContacts.remove(position);
            System.out.println("The contact " + contact.getName() +" is deleted from phone list.");
            return true;
        }
    }

    public int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    public int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i; // Trả về i luôn, thay vì "this.contact.indexOf(i)"
            }
        }
        return -1;
    }


    public String queryContact(Contact contact) { // Trả về String thay vì boolean
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        else {
            return null;
        }
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContactList() {
        System.out.println("Contact List: ");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". Name: " + this.myContacts.get(i).getName() + " , number: " + this.myContacts.get(i).getNumber());
        }
    }
}

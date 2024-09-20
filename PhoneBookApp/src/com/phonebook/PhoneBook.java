package com.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
    }

    public void deleteContact(String name) {
        contacts.removeIf(contact -> contact.getName().equals(name));
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }
}

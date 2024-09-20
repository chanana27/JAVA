package com.phonebook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhoneBookGUI {
    private JFrame frame;
    private PhoneBook phoneBook;
    private JTextArea displayArea;
    private JTextField nameField;
    private JTextField phoneField;

    public PhoneBookGUI() {
        phoneBook = new PhoneBook();
        frame = new JFrame("Phone Book");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        nameField = new JTextField();
        phoneField = new JTextField();
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        displayArea = new JTextArea();

        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Phone Number:"));
        panel.add(phoneField);
        panel.add(addButton);
        panel.add(deleteButton);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(displayArea), BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phone = phoneField.getText();

                if (validateInput(name, phone)) {
                    if (!isNameAlreadyExist(name)) {
                        phoneBook.addContact(name, phone);
                        updateDisplay();
                        clearFields();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Name already exists! Each name should have a unique phone number.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid input! Name cannot be empty and phone number must be exactly 10 digits.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                phoneBook.deleteContact(name);
                updateDisplay();
                clearFields();
            }
        });

        frame.setVisible(true);
    }

    private boolean validateInput(String name, String phone) {
        return !name.isEmpty() && phone.length() == 10 && phone.matches("\\d+");
    }

    private boolean isNameAlreadyExist(String name) {
        for (Contact contact : phoneBook.getAllContacts()) {
            if (contact.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private void updateDisplay() {
        displayArea.setText("");
        for (Contact contact : phoneBook.getAllContacts()) {
            displayArea.append(contact.getName() + " - " + contact.getPhoneNumber() + "\n");
        }
    }

    private void clearFields() {
        nameField.setText("");
        phoneField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PhoneBookGUI();
            }
        });
    }
}

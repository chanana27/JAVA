import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    private HashMap<String, Contact> contacts;
    private Scanner scanner;

    public PhoneBook() {
        contacts = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        int choice;
        do {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    deleteContact();
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    System.out.println("Exiting PhoneBook application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void printMenu() {
        System.out.println("\nPhoneBook Menu:");
        System.out.println("1. Add Contact");
        System.out.println("2. Delete Contact");
        System.out.println("3. Display All Contacts");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter mobile number: ");
        String mobileNumber = scanner.nextLine();

        if (contacts.containsKey(mobileNumber)) {
            System.out.println("Contact with mobile number " + mobileNumber + " already exists!");
        } else {
            contacts.put(mobileNumber, new Contact(name, mobileNumber));
            System.out.println("Contact added successfully!");
        }
    }

    private void deleteContact() {
        System.out.print("Enter mobile number to delete: ");
        String mobileNumber = scanner.nextLine();

        if (contacts.containsKey(mobileNumber)) {
            contacts.remove(mobileNumber);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact with mobile number " + mobileNumber + " not found!");
        }
    }

    private void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("PhoneBook is empty!");
        } else {
            for (Contact contact : contacts.values()) {
                System.out.println("Name: " + contact.getName() + ", Mobile Number: " + contact.getMobileNumber());
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook PhoneBook = new PhoneBook();
        PhoneBook.run();
    }
}

class Contact {
    private String name;
    private String mobileNumber;

    public Contact(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
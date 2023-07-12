package dz5;


public class prodject {
    public static void main(String[] args) {
        phoneBook phoneBook = new phoneBook();
        phoneBook.addContact("Иван","1212312");
        phoneBook.addContact("Иван","4444");
        phoneBook.addContact("Игорь","5555");
        phoneBook.addContact("Игорь","5555");
        phoneBook.addContact("Игорь","5555");
        phoneBook.addContact("Толя","5555");
        phoneBook.printPhoneBook();
    }
}

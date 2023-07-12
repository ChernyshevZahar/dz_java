package dz5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>(); 
    void addContact(String name, String phoneNumber) {  
        if (phoneBook.containsKey(name)) {  
            List<String> phoneNumbers = phoneBook.get(name);  
            phoneNumbers.add(phoneNumber);  
            phoneBook.put(name, phoneNumbers);
        } else {  
            List<String> phoneNumbers = new ArrayList<>();  
            phoneNumbers.add(phoneNumber);  
            phoneBook.put(name, phoneNumbers);  
        }  
    }  
    void printPhoneBook() { 
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(entries, (entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size())); 
  
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : entries) {  
            stringBuilder.append(
                                "Имя: " + entry.getKey()
                                + ", Телефоны: " + entry.getValue()
                                + "\n"
                                );  
        }  
        System.out.println(stringBuilder);
    }  
}  


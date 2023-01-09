package Lesson005;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, LinkedList<String>> storage = new HashMap<>();
    public void add(String surname, String phoneNumber) {
        String name = new String();
        String number = new String();
        LinkedList<String> new_write = new LinkedList<String>();
        name = surname;
        number = phoneNumber;
            if (!storage.containsKey(name)){ // Check if key (name) is not present in Map
                new_write.add(number); // Add number to list
                storage.put(name, new_write); // Add value (list with number) to key (name)
            }
            else{
                new_write.addAll(storage.get(name)); // If key (name) is present in Map read value from the key and add it to list
                new_write.add(number); // Add new number to the list
                storage.put(name, new_write); // Add value (list with numbers) to key (name)
            }
    }
    public List<String> getBySurname(String surname) {
        System.out.println("Numbers related to '" + surname + "': ");
        return storage.get(surname);
    }
}

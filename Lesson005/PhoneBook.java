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
            if (!storage.containsKey(name)){
                // System.out.println("YES");
                // LinkedList<String> new_write = new LinkedList<String>();
                new_write.add(number);
                storage.put(name, new_write);
            }
            else{
                new_write.addAll(storage.get(name));
                new_write.add(number);
                storage.put(name, new_write);
                // System.out.println("NO");
            }
        // new_write.add(number);
        // storage.putIfAbsent(name, new_write);
        // System.out.println(storage);
    }
    public List<String> getBySurname(String surname) {
        System.out.println("Numbers related to '" + surname + "': ");
        return storage.get(surname);
    }
}

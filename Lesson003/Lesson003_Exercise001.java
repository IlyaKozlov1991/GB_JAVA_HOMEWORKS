package Lesson003;

import java.util.ArrayList;
import java.util.Random;

public class Lesson003_Exercise001 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Random random = new Random(); // Object 'random' of class 'Random'
        for (int i = 0; i < 17; i++) { // Fill array with 17 random numbers from 0 to 100
            int a = random.nextInt(100);
            list1.add(a);
        }
        System.out.println("Initial list: " + list1);
        list1 = check_even(list1);
        System.out.println("List with even numbers removed: " + list1);
    }
    private static ArrayList<Integer> check_even(ArrayList<Integer> list){
        ArrayList<Integer> int_list = new ArrayList<Integer>(); // Create new internal list
        for (int i = 0; i < list.size(); i++) {
            int b = (list.get(i) % 2); // Check if item of list is even or odd
            if (b == 1){ // If item is odd -> add it to internal list
                int_list.add(list.get(i));
            }
        }
        return int_list;
    }
}

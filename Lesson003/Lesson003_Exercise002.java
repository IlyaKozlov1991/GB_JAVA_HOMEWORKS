package Lesson003;

import java.util.ArrayList;
import java.util.Random;

public class Lesson003_Exercise002 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Random random = new Random(); // Object 'random' of class 'Random'
        int a = random.nextInt(20);
        for (int i = 0; i < a; i++) { // Fill array with random numbers from 0 to 99
            int b = random.nextInt(100);
            list1.add(b);
        }
        System.out.println("Initial list: " + list1);
        int min = list1.get(0);
        int max = list1.get(0);
        int avg = 0;
        for (int i = 1; i < list1.size(); i++) { // Find max and min
            if (list1.get(i) < min){
                min = list1.get(i);
            }
            else if (list1.get(i) > max){
                max = list1.get(i);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            avg = avg + list1.get(i);
        }
        System.out.println("Min value in the list: " + min);
        System.out.println("Max value in the list: " + max);
        System.out.println("Average of the list: " + avg / list1.size()); 

}
}
package Lesson001;

import java.util.Arrays;

public class Lesson001_Exercise011 {
    public static void main(String[] args) {
        int[] array = new int[] {22, 17, 3, 5, 10, 84}; 
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
    }
}

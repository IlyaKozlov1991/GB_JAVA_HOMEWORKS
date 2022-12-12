package Lesson001;

import java.util.Arrays;

public class Lesson001_Exercise008 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6){
                array[i] = array[i] * 6;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
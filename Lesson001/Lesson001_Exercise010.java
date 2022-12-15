//

package Lesson001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lesson001_Exercise010 {
    public static void main(String[] args) throws IOException {
        BufferedReader in_string = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter LENGTH value:");
        String s1 = in_string.readLine();
        int a = Integer.parseInt(s1);
        System.out.println("Enter INITIAL value:");
        String s2 = in_string.readLine();
        int b = Integer.parseInt(s2);
        int[] my_array = new int[a];
        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = b;
        }
        System.out.println(Arrays.toString(my_array));

    }
}
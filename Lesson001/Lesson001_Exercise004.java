/*

 */

package Lesson001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson001_Exercise004 {
    public static void main(String[] args) throws IOException {
        BufferedReader in_string = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string and number splited by '-' ( example: some text string-3) ");
        String s = in_string.readLine();
        String[] arr_string = s.split("-", 2);
        Integer a = Integer.parseInt(arr_string[1]);
        for (int i = 0; i < a; i++) {
            System.out.println(arr_string[0]);            
        }    
    }
}
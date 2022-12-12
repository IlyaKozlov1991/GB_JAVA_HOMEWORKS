package Lesson001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson001_Exercise005 {
    public static void main(String[] args) throws IOException {
        BufferedReader in_string = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your year");
        String s = in_string.readLine();
        int a = Integer.parseInt(s);
        boolean d = (a % 4 == 0 || a % 400 == 0);
        System.out.println(d);
    }
}    

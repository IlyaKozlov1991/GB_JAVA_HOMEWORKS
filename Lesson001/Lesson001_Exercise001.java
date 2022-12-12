package Lesson001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson001_Exercise001 {
    public static void main(String[] args) throws IOException {
        BufferedReader in_string = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number");
        String s = in_string.readLine();
        int a = Integer.parseInt(s);
        //s = null;
        System.out.println("Enter your number");
        s = in_string.readLine();
        int b = Integer.parseInt(s);
        int c = a + b;
        boolean d = (c >= 10 && c <= 20);
        System.out.println(d);
    }
}        
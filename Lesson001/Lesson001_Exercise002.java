/*
 Ex02
 */
package Lesson001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson001_Exercise002 {
    public static void main(String[] args) throws IOException {
        BufferedReader in_string = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number");
        String s = in_string.readLine();
        int a = Integer.parseInt(s);
        if (a >= 0){
            System.out.println("Input number is positive");
        }
        else{
            System.out.println("Input number is negative");
        }  
    }
}
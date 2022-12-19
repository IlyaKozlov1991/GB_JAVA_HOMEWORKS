package Lesson002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Lesson002_Exercise001 {
    public static void main(String[] args) throws IOException {
        BufferedReader in_string = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string");
        String s = in_string.readLine();
        String s_reverse = "";
        for (int i = 1; i <= s.length(); i++) { // Reverse the input string
            char c1 = s.charAt(s.length() - i);
            s_reverse = s_reverse + c1;
        }
        System.out.println("Reversed string: " + s_reverse);
        boolean b = (s_reverse.equals(s)); // Compare input and reversed strings
        if (b == true){
            System.out.println("Yes, string '" +  s + "' is palindrome");
        }
        else{
            System.out.println("No, string '" +  s + "' is not palindrome");
        }
    }
}

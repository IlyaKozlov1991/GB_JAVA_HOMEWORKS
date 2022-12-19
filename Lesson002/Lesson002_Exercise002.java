package Lesson002;

import java.io.File;

public class Lesson002_Exercise002 {
    public static void main(String[] args) {
        File directory = new File("Lesson002/Exercise002_files"); // Create new directory
        if (directory.isDirectory()){
            for (File item : directory.listFiles()){ // Read all files in directory
                String file_name = item.getName();
                String s1 = "";
                int counter = 0;
                if (file_name.lastIndexOf(".") != -1 && file_name.lastIndexOf(".") != 0){ // If "." is not the first symbol in the name
                    for (int i = file_name.lastIndexOf(".") + 1; i < file_name.length(); i++) { // Count how many symbols are after "."
                        counter += 1;
                    }
                    // System.out.println("Counter: " + counter);
                    for (int i = 0; i < counter; i++) { // Create a new string consisting of symbols after "." in name
                        char c1 = file_name.charAt(file_name.lastIndexOf(".") + 1 + i);
                        s1 = s1 + c1;
                    }
                    // System.out.println("s1: " + s1);
                    System.out.println("File '" + item.getName() + "' format: " + s1);
                }
                // System.out.println("File '" + item.getName() + "' format: ");
            }
        }
    }
}

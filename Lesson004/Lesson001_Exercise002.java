package Lesson004;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Lesson001_Exercise002 {
    public static void main(String[] args) throws IOException {
        LinkedList<String> text_list = new LinkedList<String>();
        /* text_list.add("first");
        text_list.add("second");
        text_list.add("third");
        text_list.add("fourth");
        text_list.add("fifth"); */
        File my_File = new File("Lesson004\\my_File.txt"); // Read LinkedList created in Exercise001
        Scanner new_read = new Scanner(my_File);
        while (new_read.hasNextLine()){
            String data = new_read.nextLine();
            text_list.add(data);
        }
        new_read.close();
        System.out.println("Origin LinkedList: " + text_list);
        text_list = reverse(text_list);
        System.out.println("Reversed LinkedListL: " + text_list);
    }
    private static <String> LinkedList<String> reverse(LinkedList<String> source) {
        LinkedList<String> internal_list = new LinkedList<String>();
        Integer i = source.size() - 1;
        while (i >= 0){
            // System.out.println(source.get(i));
            internal_list.add(source.get(i));
            i--;
        }
        return internal_list;
    }
}

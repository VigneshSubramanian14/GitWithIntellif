package PractiseTheseJavaProgram.multipleWordInString;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindMultipleWordInString1 {

    public void multipleWord() {
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String obj = sc.nextLine();
        String[] value = obj.split(" ");
        Map<String, String> output = new HashMap<>();
        for (String words : value) {
            String word = words.toUpperCase();
            if (output.get(word) != null) {
                System.out.println("The duplicate values are: " + word);
            } else {
                output.put(word, word);
            }
        }
    }

    public static void main(String[] args) {
        FindMultipleWordInString1 obj = new FindMultipleWordInString1();
        obj.multipleWord();
    }
}

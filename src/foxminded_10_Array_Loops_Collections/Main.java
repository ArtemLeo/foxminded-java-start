package foxminded_10_Array_Loops_Collections;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String source = "Hello World";
        System.out.println(source);
        System.out.println("--------------------------");

        String[] words = source.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("Array length = " + words.length);
        System.out.println(words[0]);
        System.out.println("--------------------------");

        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("--------------------------");

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            char[] letter = words[i].toCharArray();
            System.out.print(" " + Arrays.toString(letter));
            System.out.print(" -> length of this word = " + words[i].length() + " letters");
            System.out.println("");
        }
        System.out.println("--------------------------");

        char[] word1 = words[0].toCharArray();
        String[] word2 = words[1].split("");
        System.out.println(Arrays.toString(word1) + " -> length of this word = " + word1.length);
        System.out.println(Arrays.toString(word2) + " -> length of this word = " + word2.length);
    }
}

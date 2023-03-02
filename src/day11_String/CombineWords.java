package day11_String;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two words below");

        System.out.println("Enter word one:");
        String word1 = input.nextLine();

        System.out.println("Enter word two:");
        String word2 = input.nextLine();

        String combined = word1 + word2;

        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) { // if word1 ends with same character as word2 starts with.

            combined = word1 + word2.substring(1);
        }

        System.out.println(combined);
    }
}
/*
5. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight

 */
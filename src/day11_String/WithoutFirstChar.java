package day11_String;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two words below");

        System.out.println("Enter word one:");
        String word1 = input.nextLine();

        System.out.println("Enter word two:");
        String word2 = input.nextLine();

        word1 = word1.substring(1);

        word2 = word2.substring(1);

        String word3 = word1 + word2;

        System.out.println(word3);

    }
}
/*
4. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */
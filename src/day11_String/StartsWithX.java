package day11_String;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        if (word.startsWith("x")) {
            String newWord = "a" + word.substring(1);
            System.out.println("Output: " + newWord);
        } else {
            System.out.println("Output: " + word);
        }
    }

}
/*
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String word = input.next();


        if (word.startsWith("x")){
           word = word.replaceFirst("x", "a");

            System.out.println(word);
        }

    }

 */
/*
1. Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
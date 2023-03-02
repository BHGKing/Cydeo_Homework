package day11_String;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();

        if(word.startsWith("x")){

           word = word.replaceFirst("x", "a");

            System.out.println(word);

        }else if (word.startsWith("X")){

            word = word.replaceFirst("X", "A");

            System.out.println(word);

        } else {
            System.out.println(word);
        }
    }
}
/*
2. Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
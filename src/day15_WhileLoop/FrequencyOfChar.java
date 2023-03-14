package day15_WhileLoop;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = input.next();

        System.out.println("Enter a single character to find in the string above:");
        char ch = input.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch){
                frequency++;
            }

        }

        System.out.println(frequency);
    }
}
/*
3. Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */
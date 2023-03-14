package day15_WhileLoop;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = input.next();

        System.out.println(getUniqueChars(str));



    }
    public static String getUniqueChars(String str) {
        String uniqueChars = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                uniqueChars += c;
            }
        }
        return uniqueChars;
    }
}
/*
9. Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD
 */
package day14_For_Loop;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = input.nextLine();

        boolean isPalindrome = true;
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}



/*
7. Write a program that can check if the given String is palindrome

Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */
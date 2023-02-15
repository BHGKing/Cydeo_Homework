package day06_Intro_If_Statements;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = '1'; // the character to check

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a letter.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a number.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }
}

/*
5. Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */
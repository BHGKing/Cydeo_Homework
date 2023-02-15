package day06_Intro_If_Statements;

public class NumberToWord {
    public static void main(String[] args) {

        int num = 9;
        String output = " ";

        if (num == 1){
            output = "One";
        }
        if (num == 2){
            output = "Two";
        }
        if (num == 3){
            output = "Three";
        }
        if (num == 4){
            output = "Four";
        }
        if (num == 5){
            output = "Five";
        }
        if (num == 6){
            output = "Six";
        }
        if (num == 7){
            output = "Seven";
        }
        if (num == 8){
            output = "Eight";
        }
        if (num == 9){
            output = "Nine";
        }

        System.out.println(output);
    }
}
/*
2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
 */
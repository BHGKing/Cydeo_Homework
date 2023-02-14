package day06_Intro_If_Statements;

public class PosNegZero {
    public static void main(String[] args) {

        int num = 20;

        boolean isPositive = num > 0;
        boolean isNegative = num < 0;
        boolean isEqual = num == 0;

        if(isPositive){
            System.out.println("Positive");
        }
        if(isNegative){
            System.out.println("Negative");
        }
        if(isEqual){
            System.out.println("Equal");
        }
    }
}
/*
    2. An integer variable named number is declared and given, Write a program can identify if the number is positive, negative or zero
Ex:
    number = 20
output:
    Positive
 */
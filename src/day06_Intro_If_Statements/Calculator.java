package day06_Intro_If_Statements;

public class Calculator {
    public static void main(String[] args) {

        double n1 = 10;
        double n2 = 20;
        double output = 0;
        char mathOperator = '+';

        if (mathOperator == '+') {
            output = n1 + n2;
        }
        if (mathOperator == '-'){
            output = n1 - n2;
        }
        if (mathOperator == '*'){
            output = n1 * n2;
        }
        if (mathOperator == '/'){
            output = n1 / n2;
        }
        System.out.println(output);
    }
}
/*
3. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */
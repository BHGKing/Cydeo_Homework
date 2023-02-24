package day08_TernarySwitch;

public class Calculator {
    public static void main(String[] args) {

        char operator = '-';
        int n1 = 50;
        int n2 = 20;
        int result = 0;

        switch (operator){

            case '-':
                result = n2 - n1;
               break;
            case '+':
                result = n2 + n1;
                break;

            case '*':
                result = n2 * n1;
                break;

            case '/':
                result = n2 / n1;
                break;

            default:
                result = 0;
        }
        System.out.println(result);
    }
}

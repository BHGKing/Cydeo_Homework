package day12_Custom_Methods_Intro;

public class monthName {
    public static void main(String[] args) {

        monthName(2);

    }

    public static void monthName(int number){

        int num = number;
        switch (num){
            case 1:
                System.out.println("January");
            break;
            case 2:
                System.out.println("February");
            break;
            case 3:
                System.out.println("March");
            break;
            case 4:
                System.out.println("April");
            break;
            case 5:
                System.out.println("May");
            break;
            case 6:
                System.out.println("June");
            break;
            case 7:
                System.out.println("July");
            break;
            case 8:
                System.out.println("August");
            break;
            case 9:
                System.out.println("September");
            break;
            case 10:
                System.out.println("October");
            break;
            case 11:
                System.out.println("November");
            break;
            case 12:
                System.out.println("December");
            break;
            default:
                System.out.println("Invalid Month Number");
        }
    }
}
/*
3. Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */
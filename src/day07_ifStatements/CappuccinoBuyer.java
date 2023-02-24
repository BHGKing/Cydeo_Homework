package day07_ifStatements;
import java.util.*;
public class CappuccinoBuyer {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String size = keyboard.nextLine();

        //String size = "tall";
        //String size2 = size;
        if (size =="tall" || size == "grande" || size == "venti"){
            if (size == "tall") {
                size = " size tall: price is $3.69\n\t         90 calories";
            } else if (size == "grande") {
                size = "size grande: price is $3.99\n\t         120calories";
            } else {
                size = "size venti: price is $4.29\n\t         150calories";
            }
        }else {
            size = "Invalid size";
        }

/*
        String size = "test";
        

        if (size == "tall" || size == "grande" || size == "tall"){

            if (size == "tall"){
                System.out.println(size+ ": " + "\n\t\tPrice is: $3.69 \n\t\t90 calories");
            }else if (size == "grande"){
                System.out.println(size+ ": " + "\n\t\tPrice is: $3.99 \n\t\t 120 calories");
            }else {
                System.out.println(size+ ": " + "\n\t\tPrice is: $4.29 \n\t\t 150 calories");
            }

        } else {
            System.out.println("Invalid Size");
        }
*/
    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if
 */
package day09_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your current speed");

        int speedLimit = input.nextInt();

          if (speedLimit >= 55) {

              System.out.println("You're driving " + (speedLimit - 55) + " over the limit. Slow Down!");

          } else {
              System.out.println();
          }
    }
}
/*
4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!
 */
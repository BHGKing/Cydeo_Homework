package day06_Intro_If_Statements;

public class OxygenTank {
    public static void main(String[] args) {

        double num = 100;
        String output = " ";

        if (num >= 50){
            output =  "Be careful you are at 50%";
        }
        if (num >= 60){
            output = "Start to head back";
        }
        if (num >= 70){
            output =  "Don't go too far";
        }
        if (num >= 80){
            output = "Sill okay";
        }
        if (num >= 90){
            output = "Your tank is full";
        }
        System.out.println(output);
    }
}
/*
8. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */
package day12_Custom_Methods_Intro;

public class eligibleToVote {
    public static void main(String[] args) {

        eligibleToVote(23, true);

    }

    public static void eligibleToVote(int age, boolean isAmerican){

        if (isAmerican == true){

            if (age >= 18){

                System.out.println("You are eligible to vote!");

            }else {
                System.out.println("You must be at least 18 years old");
            }

        }else {
            System.out.println("You cannot vote!");
        }




    }






}

package day12_Custom_Methods_Intro;

public class eligibleToVote {
    public static void main(String[] args) {

        eligibleToVote(23, true);

    }

    public static void eligibleToVote(int age, boolean isAmerican){

        if (age >= 18 && isAmerican == true){

            System.out.println("You are eligible to vote!");

        }else {
            System.out.println("You cannot vote!");
        }

    }

}

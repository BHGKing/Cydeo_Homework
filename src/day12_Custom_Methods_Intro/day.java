package day12_Custom_Methods_Intro;

public class day {

    public static void main(String[] args) {

        day(5);

    }

    public static void day(int number){

        String output = "";

        if (number >= 1 && number <= 7){

            switch (number){

                case 1:
                    output = "Monday";
                break;
                case 2:
                    output = "Tuesday";
                break;
                case 3:
                    output = "Wednesday";
                break;
                case 4:
                    output = "Thursday";
                break;
                case 5:
                    output = "Friday";
                break;
                case 6:
                    output = "Saturday";
                break;
                case 7:
                    output = "Sunday";
                break;

            }

            System.out.println(output);

        }else {
            System.out.println("Invalid Number");
        }
    }
}

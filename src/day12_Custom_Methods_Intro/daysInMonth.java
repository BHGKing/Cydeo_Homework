package day12_Custom_Methods_Intro;

public class daysInMonth {

    public static void main(String[] args) {

        month("jUNe");

    }

    public static void month(String month){

        String daysInMonth = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();

        if (daysInMonth.equalsIgnoreCase("January") || daysInMonth.equalsIgnoreCase("March")
                || daysInMonth.equalsIgnoreCase("May") || daysInMonth.equalsIgnoreCase("July")
                || daysInMonth.equalsIgnoreCase("August") || daysInMonth.equalsIgnoreCase("October")
                || daysInMonth.equalsIgnoreCase("December")){

            System.out.println(daysInMonth + " has 31 days");
        } else if (daysInMonth.equalsIgnoreCase("April") || daysInMonth.equalsIgnoreCase("June")
                    || daysInMonth.equalsIgnoreCase("September") || daysInMonth.equalsIgnoreCase("November")){

            System.out.println(daysInMonth + " has 30 days");
        }else if (daysInMonth.equalsIgnoreCase("February")){
            System.out.println(daysInMonth + " has 28 days");
        }else {
            System.out.println("Invalid Month entered!");
        }
    }
}

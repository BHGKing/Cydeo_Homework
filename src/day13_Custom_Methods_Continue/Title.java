package day13_Custom_Methods_Continue;

public class Title {
    public static void main(String[] args) {


        System.out.println(title("jAvA"));


    }

    public static String title(String title){

        String firstLetter = title.substring(0, 1).toUpperCase();

        String properTitle = firstLetter + title.substring(1).toLowerCase();

        return properTitle;

    }

}

package day08_TernarySwitch;

public class NumberToWord {
    public static void main(String[] args) {

        int num = 1; // 1 ~ 9

        String result = (num == 1)? "One" :(num == 2)?"Two" :(num == 3)?"Three" :(num == 4)?"Four"
        :(num == 5)?"Five" :(num == 6)?"Six" :(num == 7)?"Seven" :(num == 8)?"Eight" :(num == 9)?"Nine" :"Invalid Number";

        System.out.println(result);
    }
}

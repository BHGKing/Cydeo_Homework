package day08_TernarySwitch;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 100; // 1 ~ 85+

        String result = (1 <= age && age <= 2)?"Infant" :(age >= 3 && age <= 5)?"Toddler" :(age >= 6 && age <= 9)?"Kid"
        :(age >= 10 && age <= 12)?"Pre-Teen" :(age >= 13 && age <= 17)?"Teenager" :(age >= 18 && age <= 20)?"Young Adult"
                :(age >= 21 && age <= 39)?"Adult" :(age >= 40 && age <= 49)?"Young Middle-Age Adult"
                :(age >= 50 && age <= 54)?"Middle-Age Adult" :(age >= 55 && age <= 64)?"Very Young Senior Citizen"
                :(age >= 65 && age <= 74)?"Young Senior Citizen" :(age >= 75 && age <= 84)?"Senior Citizen"
                :(age > 85)?"Old Senior Citizen" :"invalid Age";

        System.out.println(result);
    }
}

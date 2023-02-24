package day07_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {

        byte num = 18; // 1 ~ 18
        String result = " ";

        if (num >= 1 && num <= 18){

                    if (num <= 5){
                        result = "Elementary School";
                    }else if (num <= 8){
                        result = "Middle School";
                    }else if (num <= 12){
                        result = "High School";
                    }else if (num <= 16){
                        result = "College";
                    }else {
                        result = "Grad School";
                    }
            System.out.println(result);

        }else {
            System.out.println("Invalid grade level given");
        }
    }
}

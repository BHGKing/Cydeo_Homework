package day04_Primitive_Casting_Concatenation;

public class EmployeeInfo {
    public static void main(String[] args) {

        String name = "Daniel",
                gender = "Male",
                 companyName = "Google Inc.",
                  jobTitle = "Software Developer";

        int age = 28,
             salary = 90_000;

        System.out.println(name + " is " + age + " years old, gender is " + gender + ".");
        System.out.println(name + " works at " + companyName + " as a " + jobTitle + ".");
        System.out.println(name + " makes $" + salary + " per year.");




    }
}

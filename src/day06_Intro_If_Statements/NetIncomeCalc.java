package day06_Intro_If_Statements;

public class NetIncomeCalc {
    public static void main(String[] args) {

        double salary = 120_000;
        double taxes;
        boolean married = true;

        if (salary >= 130_000 && married != true) {
            taxes = salary * .35;
            salary = salary - taxes;
            System.out.println("Salary after tax not being married = $" + salary);
        }
        else if (salary >= 130_000 && married == true) {
            taxes = salary * .30;
            salary = salary - taxes;
            System.out.println("Salary after tax being married = $" + salary);
        }
        else if (salary <= 129_000 && salary >= 100_000 && married != true) {
            taxes = salary * .30;
            salary = salary - taxes;
            System.out.println("Salary after tax not being married = $" + salary);
        }
        else if (salary <= 129_000 && salary >= 100_000 && married == true) {
            taxes = salary * .25;
            salary = salary - taxes;
            System.out.println("Salary after tax being married = $" + salary);
        }
        else if (salary <= 99_000 && salary >= 80_000 && married != true){
            taxes = salary * .25;
            salary = salary - taxes;
            System.out.println("Salary after tax not being married = $" + salary);
        }
        else if (salary <= 99_000 && salary >= 80_000 && married == true) {
            taxes = salary * .20;
            salary = salary - taxes;
            System.out.println("Salary after tax being married = $" + salary);
        }
        else if (salary <= 79_000 && married != true){
            taxes = salary *.20;
            salary = salary - taxes;
            System.out.println("Salary after tax not being married = $" + salary);
        }
        else if (salary <= 79_000 && married == true) {
            taxes = salary * .15;
            salary = salary - taxes;
            System.out.println("Salary after tax being married = $" + salary);
        } else  {
            System.out.println("Invalid Number");
        }
    }
}

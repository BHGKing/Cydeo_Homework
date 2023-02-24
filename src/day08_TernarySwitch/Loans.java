package day08_TernarySwitch;

public class Loans {
    public static void main(String[] args) {

        int salary = 60_000; // +$60,000
        int creditScore = 650; // +650

        String result = (salary >= 60000 && creditScore >= 650)?"Loan Approved" :"Loan Denied";

        System.out.println(result);
    }
}

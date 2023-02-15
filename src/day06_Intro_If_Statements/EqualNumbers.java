package day06_Intro_If_Statements;

public class EqualNumbers {
    public static void main(String[] args) {

        double n1 = 2;
        double n2 = 4;
        double n3 = 5;

        if (n1 == n2 && n2 == n3 && n3 == n1){
            System.out.println("All Equal");
        }
        if (n1 == n2 && n2 != n3 && n3 != n1){
            System.out.println("n1 & n2 are equal");
        }
        if (n1 != n2 && n2 == n3 && n3 != n1){
            System.out.println("n2 & n3 are equal");
        }
        if(n1 != n2 && n2 != n3 && n3 == n1){
            System.out.println("n3 & n1 are equal");
        }
        if(n1 != n2 && n2 != n3 && n3 != n1){
            System.out.println("None are equal");
        }
    }
}
/*
7. Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal

 */
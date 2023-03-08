package day13_Custom_Methods_Continue;

public class CombineLetters {
    public static void main(String[] args) {

        String word1 = "one";
        String word2 = "eight";

        System.out.println(combineLetter(word1, word2));

    }

    public static String combineLetter(String word1, String word2){

        String combined = word1 + word2;

        if (word1.charAt(word1.length() - 1) == word2.charAt(0)){
            combined = word1 + word2.substring(1);
            return combined;
        }else {
            combined = word1 + " " + word2;
            return combined;
        }

    }





}

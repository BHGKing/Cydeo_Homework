package day13_Custom_Methods_Continue;

public class frequencyOfWord {

    public static void main(String[] args) {

        String word = "java";

        String sentence = "Java java jAvA java";

        System.out.println(frequencyOfWord(sentence, word));


    }

    public static int frequencyOfWord(String sentence, String word){

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int frequency = (sentence.length() - sentence.replace(word, "").length()) / word.length();

        return frequency;


    }

}
/*
    public static int frequencyOfWord1(String sentence, String word) {
        int count = 0;
        word = word.toLowerCase();
        sentence = sentence.toLowerCase();

        int wordLength = word.length();
        int index = sentence.indexOf(word);
        if (index != -1) {
            count++;
            int sentenceLength = sentence.length();
            String remainingSentence = sentence.substring(index + wordLength, sentenceLength);
            count += (sentenceLength - remainingSentence.replace(word, "").length()) / wordLength;
        }
        return count;
    }
 */
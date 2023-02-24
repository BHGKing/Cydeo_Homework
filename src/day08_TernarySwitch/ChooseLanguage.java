package day08_TernarySwitch;

public class ChooseLanguage {
    public static void main(String[] args) {

        int lang = 2; // 1~5

        String result = (lang == 1)?"Hello, thank for your call" :(lang == 2)?"Hola, gracias para llamar"
                :(lang == 3)?"Merhaba, aradiginiz icin tesekkurler" :(lang == 4)?"Privet, spasibo za vash zvonok"
                :(lang == 5)?"Merci ,pour votre appel" :"Invalid Number";

        System.out.println(result);


        System.out.println("------------------------------------");

        int lang1 = 2; // 1~5
        String result1 = "";

        switch (lang){

            case 1:
                result1 = "Hello, thank for your call";
                break;

            case 2:
                result1 = "Hola, gracias para llamar";
                break;

            case 3:
                result1 = "Merhaba, aradiginiz icin tesekkurler";
                break;

            case 4:
                result1 = "Privet, spasibo za vash zvonok";
                break;

            case 5:
                result1 = "Merci ,pour votre appel";
                break;

            default:
                result1 = "Invalid Number";

        }
        System.out.println(result1);
    }
}

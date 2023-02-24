package day08_TernarySwitch;

public class CydeoBatches {
    public static void main(String[] args) {

        String batch = "US Morning"; // US Morning, US Evening, EU
        String result = "";

        if (batch == "US Morning" || batch == "US Evening" || batch == "EU") {

            if (batch == "US Morning") {
                result = "Class times are 10-5 EST. M, T, Th, F.";
                } else if (batch == "US Evening") {
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                } else {
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
                }
            System.out.println(result);
        }else {
            System.out.println("Invalid Batch");
        }


        System.out.println("--------------------------------------------------------");

        String batch2 = "US Morning";

        String result2 = " ";

        switch (batch2){

            case "US Morning":
                result2 = "Class times are 10-5 EST. M, T, Th, F.";
                break;

            case "US Evening":
                result2 = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;

            case "EU":
                result2 = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;

            default:
                result2 = "Invalid Batch";
                break;

        }
        System.out.println(result2);


        System.out.println("--------------------------------------------------------");

        String batch3 = "US Morning";
        String result3 = "";

        if (batch3 == "US Morning" || batch3 == "US Evening" || batch3 == "EU"){

            switch (batch3){

                case "US Morning":
                    result3 = "Class times are 10-5 EST. M, T, Th, F.";
                    break;

                case "US Evening":
                    result3 = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;

                case "EU":
                    result3 = "Class times are  10-5 EST. M, T, W, Th, F.";
            }

        }else {
            result3 = "Invalid Batch";
        }
        System.out.println(result3);
    }
}

package day08_TernarySwitch;

public class SelectBrowser {
    public static void main(String[] args) {

        String browserName = "FireFox";

        String result = "";

        switch (browserName){

            case "Chrome":
                result = browserName + " browser selected";
                break;

            case "FireFox":
                result = browserName + " browser selected";
                break;

            case "Opera":
                result = browserName + " browser selected";
                break;

            case "Safari":
                result = browserName + " browser selected";
                break;

            case "Edge":
                result = browserName + " browser selected";

            default:
                result = "Invalid Browser Selected";
        }
        System.out.println(result);
    }
}

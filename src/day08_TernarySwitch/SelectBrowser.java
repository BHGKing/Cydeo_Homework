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
/*
9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */
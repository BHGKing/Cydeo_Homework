package day08_TernarySwitch;

public class StatusCode {
    public static void main(String[] args) {

        int statusCode = 200;

        String result = (statusCode == 200)?"Ok" :(statusCode == 201)?"Created" :(statusCode == 202)?"Accepted"
                :(statusCode == 301)?"Moved Permanently" :(statusCode == 303)?"See Other" :(statusCode == 304)?"Not Modified"
                :(statusCode == 307)?"Temporary Redirect" :(statusCode == 400)?"Bad Request" :(statusCode == 401)?"Unauthorized"
                :(statusCode == 403)?"Forbidden" :(statusCode == 410)?"Gone" :(statusCode == 500)?"Internal Server Error"
                :(statusCode == 503)?"Service Unavailable" :"Invalid Error Code";

        System.out.println(result);


        System.out.println("-------------------------------------------------------");


        int statusCode1 = 200;
        String result1 = "";

        switch (statusCode1){

            case 200:
                result1 = "Ok";
                break;

            case 201:
                result1 = "Created";
                break;

            case 202:
                result1 = "Accepted";
                break;

            case 301:
                result1 = "Moved Permanently";
                break;

            case 303:
                result1 = "See Other";
                break;

            case 304:
                result1 = "Not Modified";
                break;

            case 307:
                result1 = "Temporary Redirect";
                break;

            case 400:
                result1 = "Bad Request";
                break;

            case 401:
                result1 = "Unauthorized";
                break;

            case 403:
                result1 = "Forbidden";
                break;

            case 404:
                result1 = "Not Found";
                break;

            case 410:
                result1 = "Gone";
                break;

            case 500:
                result1 = "Internal Server Error";
                break;

            case 503:
                result1 = "Service Unavailable";
                break;

            default:
                result1 = "Invalid Error Code";

        }
        System.out.println(result1);
    }
}

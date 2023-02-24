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
/*
8. HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

        Solution 1: Must use ternary
		Solution 2:	MUST use switch statement
 */
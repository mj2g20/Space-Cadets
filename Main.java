package com.company;

import java.io.IOException;
import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void GetName(String userName){
        InputStream response;
        try{
            URL webpageURL = new URL("https://www.ecs.soton.ac.uk/people/" + userName);
            response = webpageURL.openStream();
            Scanner scanner = new Scanner(response);
            String responseBody = scanner.useDelimiter("\\A").next();
            System.out.println(responseBody.substring(responseBody.indexOf("<title>") + 7, responseBody.indexOf("</title>")));
        }
        catch (Exception e){
            System.out.println("Error Occurred");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
	    GetName(userName);
    }
}

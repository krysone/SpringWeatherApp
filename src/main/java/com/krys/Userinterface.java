package com.krys;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Userinterface {

    public void start() {
        String questionLoop;
        String userCity;
        String yes = "Y";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which City?");
            userCity = scanner.nextLine();

            System.out.println("Wanna check any other City?");
            System.out.println("(Y/N)");
            questionLoop = scanner.nextLine();

        } while (questionLoop.equalsIgnoreCase(yes));
    }

}

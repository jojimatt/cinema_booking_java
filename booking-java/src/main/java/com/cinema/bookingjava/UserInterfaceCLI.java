package com.cinema.bookingjava;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class UserInterfaceCLI {
    public static void main(String[] args) {
        System.out.println("Welcome to Cinema Booking app" +
                "\n1. List all current movies running" +
                "\n2. See show timings" +
                "\n3. Book tickets for a show" +
                "\n4. Cancel tickets for a show" +
                 "\n5. To quit\n");
        Scanner scanner = new Scanner(System.in);
        boolean input=false;
        while(!input){
            System.out.println("Please enter the option number\n");
            int option;
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("case 1");
                        break;
                    case 2:
                        System.out.println("case 2");
                        break;
                    case 3:
                        System.out.println("case 3");
                        break;
                    case 4:
                        System.out.println("case 4");
                        break;
                    default:
                        System.out.println("Invalid option");

                }
            }
            catch(Exception e){
                System.out.println("Please enter a number");
            }
            input=true;
        }

    }

}

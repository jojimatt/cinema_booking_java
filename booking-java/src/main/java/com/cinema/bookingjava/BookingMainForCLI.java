package com.cinema.bookingjava;

import java.util.Scanner;

public class BookingMainForCLI {
    public static void main(String[] args) {
        System.out.println("Welcome to CLI Booking\n");
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        while (running) {
            System.out.println("Choose your option:\n 1: Book movie \n 2: Close program \n");


            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Selected option: Book movie");
                    break;
                case 2:
                    System.out.println("Closing program");
                    running = false;
                    break;
                default: System.out.println("Invalid option");
                    break;
            }
        }
    }
}

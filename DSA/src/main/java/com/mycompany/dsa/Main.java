/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa;

/**
 *
 * @author yhuna
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Input message");
            System.out.println("2. Send message");
            System.out.println("3. View message");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            switch (option) {
                case 1:
                    System.out.print("Enter message: ");
                    String message = scanner.nextLine();
                    queue.inputMessage(message);
                    break;
                case 2:
                    queue.sendMessage();
                    break;
                case 3:
                    queue.viewMessage();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

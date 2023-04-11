/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.dsaasgm;

/**
 *
 * @author yhuna
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);   
        while (true) {
            try {
                System.out.println("**********************Menu:**********************");
                System.out.println("------------ Choose an option: ----------");
                System.out.println("*********** 1. Input content ***********");
                System.out.println("*********** 2. Send a message ***********");
                System.out.println("*********** 3. View message ***********");
                System.out.println("*********** 4. Exit ***********");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter message (max 20 characters):");
                        scanner.nextLine();
                        String message = scanner.nextLine();
                        queue.enqueue(message);
                        break;
                    case 2:
                        String dequeuedMessage = queue.dequeue();
                        if (dequeuedMessage != null) {
                            stack.push(dequeuedMessage);
                        } else {
                            System.out.println("Queue is empty.");
                        }
                        break;
                    case 3:
                        if (stack.isEmpty()) {
                            System.out.println("Stack is empty.");
                        } else {
                            while (!stack.isEmpty()) {
                                System.out.println(stack.pop());
                            }
                        }
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (Exception e) {
                System.out.println("Something went wrong.: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa;

/**
 *
 * @author yhuna
 */
public class Queue {

    private Stack inStack;
    private Stack outStack;
    private int messageCount;
    int front, rear, size;
    char[] array;
    public Queue() {
        this.inStack = new Stack();
        this.outStack = new Stack();
        this.messageCount = 0;
    }

    public void inputMessage(String message) {
        if (messageCount >= 250) {
            System.out.println("Queue is full. Cannot add more messages.");
            return;
        }
        inStack.push(message);
        messageCount++;
    }

    public void sendMessage() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        if (!outStack.isEmpty()) {
            String message = outStack.pop();
            messageCount--;
            System.out.println("Message sent: " + message);
        } else {
            System.out.println("No messages to send.");
        }
    }

    public void viewMessage() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        if (!outStack.isEmpty()) {
            System.out.println("Messages in the queue:");
            Node node = outStack.top;
            while (node != null) {
                System.out.println(node.data);
                node = node.next;
            }
        } else {
            System.out.println("No messages to view.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsaasgm;

/**
 *
 * @author yhuna
 */
public class Queue {

    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(String data) {
        try {
            if (data.length() >20) {
                throw new IllegalArgumentException("Message too long!");
            }
            Node newNode = new Node(data);
            if (isEmpty()) {
                front = newNode;
                rear = newNode;
            } else {
                rear.setNext(newNode);
                rear = newNode;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String dequeue() {
        if (isEmpty()) {
            return null;
        }
        String data = front.getData();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}

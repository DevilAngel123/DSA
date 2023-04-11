/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsaasgm;

/**
 *
 * @author yhuna
 */
public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
    }

    public String pop() {
        if (top == null) {
            return null;
        }
        String data = top.getData();
        top = top.getNext();
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

package org.example.stack;

import org.w3c.dom.Node;

import java.util.Stack;

public class MyStack {

    private Node top;
    private int length;

    public MyStack() {
    }

    static class Node {
        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
        }

        @Override
        public String toString() {

            return value.toString();
        }

    }

    public void push(Object value) {
        Node newNode = new Node(value);

        if (length == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }

        length++;
    }

    public Node remove(int index) {

        Node temp = top;

        for (int i = 0; i < index; i++) {
            temp = top;
           pop();
        }

        return temp;
    }

    public void clear() {

        remove(length);
    }

    public int size() {

        return length;
    }

    public Node peek() {

        return top;
    }

    public Node pop() {

        if(length == 0){
            return null;
        }

        Node temp = top;

        top = top.next;
        temp.next = null;
        length--;

        return temp;
    }

    public void print() {
        Node temp = top;

        System.out.print("MyStack: ");
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

package org.example.queue;

public class MyQueue{

    private Node first;
    private Node last;
    private int length;

    public MyQueue() {
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

    public void add(Object value){
        Node newNode = new Node(value);

        if(length == 0){
            first = newNode;
            last = newNode;
            length++;
        } else {
            last.next = newNode;
            last = newNode;
            length++;
        }
    }

    public void clear(){
        if (length == 0){
            return;
        }

        for (int i = length; i > 0; i--) {
            poll();
        }
    }

    public int size(){
        return length;
    }

    public Node peek(){
        return first;
    }

    public Node poll(){
        if (length == 0){
            return null;
        }

        Node temp = first;
        if (length == 1){
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }

        length--;
        return temp;
    }

    public void print() {
        Node temp = first;
        System.out.print("MyQueue: ");
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

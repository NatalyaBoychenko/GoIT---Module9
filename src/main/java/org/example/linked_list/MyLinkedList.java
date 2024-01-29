package org.example.linked_list;

public class MyLinkedList{

    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList() {
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


    public void add(Object value) {

        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
            length = 1;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = null;
            length++;
        }
    }

    public Node remove(int index){
        if (index < 0 || index >= length){
            return null;
        }

        if (index == 0) {
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            return temp;
        }

        Node temp = get(index);
        Node prev = get(index - 1);

        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }


    public void clear(){
        for (int i = length -1; i >= 0; i--) {
            remove(i);
        }
    }

    public int size() {
        return length;
    }

    public Node get(int index) {

        if (index < 0 || index >= length) {
            System.out.print("wrong index: ");
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList(){
        Node temp = head;
        System.out.print("MyLinkedList: ");
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

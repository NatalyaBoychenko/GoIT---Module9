package org.example.linked_list;

public class Main {
    public static void main(String[] args) {

        MyLinkedList myList = new MyLinkedList();

        myList.add(33);
        myList.add(27);
        myList.add(1);
        myList.add(13);
        myList.add(19);
        myList.add(74);

        myList.printList();
        System.out.println("Size: " + myList.size());
        System.out.println();

        System.out.println("myList.get(1) = " + myList.get(1));
        System.out.println("myList.get(4) = " + myList.get(4));
        System.out.println();

        System.out.println("myList.remove(0) = " + myList.remove(2));
        System.out.println("myList.remove(1) = " + myList.remove(1));
        System.out.println();

        myList.printList();

        myList.clear();
        System.out.println("After clear():");
        myList.printList();

    }
}

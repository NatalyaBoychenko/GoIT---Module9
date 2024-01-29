package org.example.array_list;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add(12);
        myArrayList.add(13);
        myArrayList.add(14);
        myArrayList.add(15);
        myArrayList.add(16);

        myArrayList.printList();
        System.out.println("Size() = " + myArrayList.size());
        System.out.println();

        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));
        System.out.println("myArrayList.get(3) = " + myArrayList.get(3));
        System.out.println("myArrayList.get(6) = " + myArrayList.get(6));
        System.out.println();

        System.out.println("myArrayList.remove(3) = " + myArrayList.remove(3));
        System.out.println("myArrayList.remove(2) = " + myArrayList.remove(2));
        System.out.println("myArrayList.remove(0) = " + myArrayList.remove(0));

        System.out.println("After remove():");
        myArrayList.printList();
        System.out.println();

        myArrayList.add(52);
        myArrayList.printList();
        System.out.println("After clear():");
        myArrayList.clear();
        myArrayList.printList();


    }
}

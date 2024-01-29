package org.example.queue;

public class Main {
    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        myQueue.add(10);
        myQueue.add(12);
        myQueue.add(14);
        myQueue.add(17);
        myQueue.add(18);

        myQueue.print();
        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println();

        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println();

        System.out.println("myQueue.poll() = " + myQueue.poll());
        myQueue.print();
        System.out.println();

        myQueue.clear();
        System.out.println("After clear(): ");
        myQueue.print();

    }
}

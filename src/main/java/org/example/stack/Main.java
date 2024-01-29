package org.example.stack;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(12);
        myStack.push(14);
        myStack.push(16);
        myStack.push(18);
        myStack.push(19);
        myStack.push(20);
        myStack.push(21);
        myStack.push(22);
        myStack.push(23);
        myStack.push(24);

        myStack.print();
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println();

        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println();

        System.out.println("myStack.pop() = " + myStack.pop());
        myStack.print();
        System.out.println();

        System.out.println("myStack.remove(4) = " + myStack.remove(4));
        System.out.println("after remove():");
        myStack.print();
        System.out.println();

        myStack.clear();
        System.out.println("after clear():");
        myStack.print();


    }
}

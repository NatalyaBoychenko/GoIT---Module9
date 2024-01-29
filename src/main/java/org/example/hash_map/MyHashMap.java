package org.example.hash_map;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap {

    private final Node[] hashTable;
    private int length;

     class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;

            Node node = (Node) object;

            if (!Objects.equals(key, node.key)) return false;
            return Objects.equals(value, node.value);
        }

        @Override
        public int hashCode() {
            return key != null ? key.hashCode() : 0;
        }
    }

    public MyHashMap() {
        int size = 7;
        hashTable = new Node[size];
    }

    public void print() {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println(i + ":");
            Node temp = hashTable[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(Object key) {
        int hash = key.hashCode() % hashTable.length;
        return Math.abs(hash);
    }


    public void put(Object key, Object value) {

        int index = hash(key);

        Node node = hashTable[index];
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }

        Node newNode = new Node(key, value);
        if (hashTable[index] == null){
            hashTable[index] = newNode;
        } else {
            Node temp = hashTable[index];
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

        length++;
    }

    public Node remove(Object key){
        int index = hash(key);
        Node temp = hashTable[index];
        Node prev = null;

        while (temp != null) {
            if (temp.key.equals(key)) {
                if (prev == null) {
                    hashTable[index] = temp.next;
                } else {
                    prev.next = temp.next;
                }
                length--;
                return temp;
            }
            prev = temp;
            temp = temp.next;
        }
        return temp;
    }

    public void clear() {
        Arrays.fill(hashTable, null);
        length = 0;
    }

    public int size() {
        return length;
    }

    public Object get(Object key) {
        int index = hash(key);
        Node temp = hashTable[index];
        while (temp != null) {
            if (temp.key == key) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }
}

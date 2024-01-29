package org.example.hash_map;

public class Main {
    public static void main(String[] args) {

        MyHashMap myHashTable = new MyHashMap();

        myHashTable.put("apple", 100);
        myHashTable.put("banana", 50);
        myHashTable.put("banana", 5000000);
        myHashTable.put("cucumber", 80);
        myHashTable.put("orange", 200);
        myHashTable.put("kiwi", 140);
        myHashTable.put("apple", 140);
        myHashTable.put("fiq", 140);
        myHashTable.put("fiq", 140);


        myHashTable.print();
        System.out.println("myHashTable.size() = " + myHashTable.size());

        System.out.println("myHashTable.get(\"tile\") = " + myHashTable.get("kiwi"));
        System.out.println("myHashTable.get(\"apple\") = " + myHashTable.get("apple"));
        System.out.println("myHashTable.get(\"pork\") = " + myHashTable.get("pork"));
        System.out.println();

        System.out.println("after remove:");
        System.out.println("myHashTable.remove(\"apple\") = " + myHashTable.remove("apple"));
        System.out.println("myHashTable.remove(\"fiq\") = " + myHashTable.remove("fiq"));
        System.out.println("myHashTable.remove(\"pork\") = " + myHashTable.remove("pork"));
        myHashTable.print();
        System.out.println("myHashTable.size() = " + myHashTable.size());
        System.out.println();

        myHashTable.clear();
        System.out.println("after clear:");
        myHashTable.print();
        System.out.println("myHashTable.size() = " + myHashTable.size());


    }
}

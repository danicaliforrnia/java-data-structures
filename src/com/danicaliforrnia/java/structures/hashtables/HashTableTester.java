package com.danicaliforrnia.java.structures.hashtables;

public class HashTableTester {

    public static void main(String[] args) {
        LinkedHashTable<Integer, String> linkedHashTable = new LinkedHashTable<>();

        System.out.println("--------Test 1: Put---------");
        linkedHashTable.put(1, "A");
        linkedHashTable.put(2, "B");
        linkedHashTable.put(3, "C");
        linkedHashTable.put(4, "D");
        System.out.println("size: " + linkedHashTable.size());
        System.out.println(linkedHashTable);

        System.out.println("--------Test 2: Contains Key---------");
        System.out.println("Key 1: " + linkedHashTable.containsKey(1));
        System.out.println("Key 2: " + linkedHashTable.containsKey(2));
        System.out.println("Key 10: " + linkedHashTable.containsKey(10));

        System.out.println("--------Test 3: Get---------");
        System.out.println("Key 1: " + linkedHashTable.get(1));
        System.out.println("Key 2: " + linkedHashTable.get(2));
        System.out.println("Key 10: " + linkedHashTable.get(10));

        System.out.println("--------Test 3: Remove---------");
        linkedHashTable.remove(4);
        linkedHashTable.remove(1);
        System.out.println("size: " + linkedHashTable.size());
        System.out.println(linkedHashTable);

        System.out.println("--------Test 4: Put---------");
        linkedHashTable.put(1, "A");
        linkedHashTable.put(1, "ABC");
        System.out.println("size: " + linkedHashTable.size());
        System.out.println(linkedHashTable);
    }

}

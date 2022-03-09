package com.danicaliforrnia.java.structures.linkedLists;

public class DoubleLinkedListTester {

    public static void main(String[] args) {
        DoubleLinkedList<String> doubleLinkedList = new DoubleLinkedList<>();

        System.out.println("--------Test 1: Insert---------");
        doubleLinkedList.insert("hello");
        doubleLinkedList.insert("World2");
        doubleLinkedList.insert("World3");
        doubleLinkedList.insert("Worldd", 1);
        System.out.println("size: " + doubleLinkedList.size());
        System.out.println(doubleLinkedList);

        System.out.println("--------Test 2: Replace---------");
        doubleLinkedList.replace("World", 1);
        doubleLinkedList.replace("Hello", 0);
        doubleLinkedList.replace("WORLD2", 2);
        doubleLinkedList.replace("WORLD3", 3);
        System.out.println("size: " + doubleLinkedList.size());
        System.out.println(doubleLinkedList);

        System.out.println("--------Test 3: Remove---------");
        doubleLinkedList.remove(2);
        doubleLinkedList.remove("WORLD3");
        System.out.println("size: " + doubleLinkedList.size());
        System.out.println(doubleLinkedList);

        System.out.println("--------Test 4: Get---------");
        System.out.println(doubleLinkedList.get(0));
        System.out.println(doubleLinkedList.get(1));
        System.out.println("size: " + doubleLinkedList.size());
        System.out.println(doubleLinkedList);
    }

}

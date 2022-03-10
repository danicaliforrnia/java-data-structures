package com.danicaliforrnia.java.structures.linkedLists;

public class DoublyLinkedListTester {

    public static void main(String[] args) {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();

        System.out.println("--------Test 1: Insert---------");
        doublyLinkedList.insert("hello");
        doublyLinkedList.insert("World2");
        doublyLinkedList.insert("World3");
        doublyLinkedList.insert("Worldd", 1);
        System.out.println("size: " + doublyLinkedList.size());
        System.out.println(doublyLinkedList);

        System.out.println("--------Test 2: Replace---------");
        doublyLinkedList.replace("World", 1);
        doublyLinkedList.replace("Hello", 0);
        doublyLinkedList.replace("WORLD2", 2);
        doublyLinkedList.replace("WORLD3", 3);
        System.out.println("size: " + doublyLinkedList.size());
        System.out.println(doublyLinkedList);

        System.out.println("--------Test 3: Remove---------");
        doublyLinkedList.remove(2);
        doublyLinkedList.remove("WORLD3");
        System.out.println("size: " + doublyLinkedList.size());
        System.out.println(doublyLinkedList);

        System.out.println("--------Test 4: Get---------");
        System.out.println(doublyLinkedList.get(0));
        System.out.println(doublyLinkedList.get(1));
        System.out.println("size: " + doublyLinkedList.size());
        System.out.println(doublyLinkedList);
    }

}

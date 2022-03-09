package com.danicaliforrnia.java.structures.linkedLists;

public class LinkedListTester {

    public static void main(String[] args) {
        LinkedList<String> singlyLinkedList = new SinglyLinkedList<>();

        System.out.println("--------Test 1---------");
        singlyLinkedList.insert("Hello");
        singlyLinkedList.insert("World");
        System.out.println("size: " + singlyLinkedList.size());
        System.out.println(singlyLinkedList);

        System.out.println("--------Test 2---------");
        singlyLinkedList.insert("!");
        System.out.println("size: " + singlyLinkedList.size());
        System.out.println(singlyLinkedList);

        System.out.println("--------Test 3---------");
        singlyLinkedList.insert("¡", 0);
        singlyLinkedList.replace("Hola", 1);
        singlyLinkedList.replace("Mundo", 2);
        System.out.println("size: " + singlyLinkedList.size());
        System.out.println(singlyLinkedList);

        System.out.println("--------Test 4---------");
        singlyLinkedList.remove(0);
        singlyLinkedList.remove(1);
        System.out.println("size: " + singlyLinkedList.size());
        System.out.println(singlyLinkedList);

        System.out.println("--------Test 5---------");
        singlyLinkedList.remove("Hola");
        singlyLinkedList.remove("!");
        System.out.println("size: " + singlyLinkedList.size());
        System.out.println(singlyLinkedList);

        System.out.println("--------Test 6---------");
        singlyLinkedList.insert("Hello");
        singlyLinkedList.insert("World");
        System.out.println("size: " + singlyLinkedList.size());
        System.out.println(singlyLinkedList);
    }

}

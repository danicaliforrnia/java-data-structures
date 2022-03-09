package com.danicaliforrnia.java.structures.linkedLists;

public class DoubleLinkedListTester {

    public static void main(String[] args) {
        LinkedList<String> doubleLinkedList = new DoubleLinkedList<>();

        System.out.println("--------Test 1---------");
        doubleLinkedList.insert("Hello");
        doubleLinkedList.insert("World2");
        doubleLinkedList.insert("World3");
        doubleLinkedList.replace("World", 1);
        doubleLinkedList.remove(2);
        System.out.println("size: " + doubleLinkedList.size());
        System.out.println(doubleLinkedList);

        System.out.println("--------Test 2---------");
        doubleLinkedList.insert("!");
        System.out.println("size: " + doubleLinkedList.size());
        System.out.println(doubleLinkedList);

        System.out.println("--------Test 3---------");
        doubleLinkedList.insert("¡", 0);
        doubleLinkedList.replace("Hola", 1);
        doubleLinkedList.replace("Mundo", 2);
        System.out.println("size: " + doubleLinkedList.size());
        System.out.println(doubleLinkedList);

        System.out.println("--------Test 4---------");
        doubleLinkedList.remove(1);
        doubleLinkedList.remove(0);
        System.out.println("size: " + doubleLinkedList.size());
        System.out.println(doubleLinkedList);

        System.out.println("--------Test 5---------");
        doubleLinkedList.remove("Mundo");
        doubleLinkedList.remove("!");
        System.out.println("size: " + doubleLinkedList.size());
        System.out.println(doubleLinkedList);

        System.out.println("--------Test 6---------");
        doubleLinkedList.insert("Hello");
        doubleLinkedList.insert("World");
        System.out.println("size: " + doubleLinkedList.size());
        System.out.println(doubleLinkedList);
    }

}

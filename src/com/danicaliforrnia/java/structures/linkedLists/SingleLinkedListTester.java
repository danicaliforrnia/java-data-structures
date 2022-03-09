package com.danicaliforrnia.java.structures.linkedLists;

public class SingleLinkedListTester {

    public static void main(String[] args) {
        LinkedList<String> singlyLinkedList = new SingleLinkedList<>();

        System.out.println("--------Test 1---------");
        singlyLinkedList.insert("Hello");
        singlyLinkedList.insert("World2");
        singlyLinkedList.insert("World3");
        singlyLinkedList.replace("World", 1);
        singlyLinkedList.remove(2);
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
        singlyLinkedList.remove(1);
        singlyLinkedList.remove(0);
        System.out.println("size: " + singlyLinkedList.size());
        System.out.println(singlyLinkedList);

        System.out.println("--------Test 5---------");
        singlyLinkedList.remove("Mundo");
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

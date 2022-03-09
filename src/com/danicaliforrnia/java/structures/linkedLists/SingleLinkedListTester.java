package com.danicaliforrnia.java.structures.linkedLists;

public class SingleLinkedListTester {

    public static void main(String[] args) {
        SingleLinkedList<String> singlyLinkedList = new SingleLinkedList<>();

        System.out.println("--------Test 1: Insert---------");
        singlyLinkedList.insert("hello");
        singlyLinkedList.insert("World2");
        singlyLinkedList.insert("World3");
        singlyLinkedList.insert("Worldd", 1);
        System.out.println("size: " + singlyLinkedList.size());
        System.out.println(singlyLinkedList);

        System.out.println("--------Test 2: Replace---------");
        singlyLinkedList.replace("World", 1);
        singlyLinkedList.replace("Hello", 0);
        singlyLinkedList.replace("WORLD2", 2);
        singlyLinkedList.replace("WORLD3", 3);
        System.out.println("size: " + singlyLinkedList.size());
        System.out.println(singlyLinkedList);

        System.out.println("--------Test 3: Remove---------");
        singlyLinkedList.remove(2);
        singlyLinkedList.remove("WORLD3");
        System.out.println("size: " + singlyLinkedList.size());
        System.out.println(singlyLinkedList);

        System.out.println("--------Test 4: Get---------");
        System.out.println(singlyLinkedList.get(0));
        System.out.println(singlyLinkedList.get(1));
        System.out.println("size: " + singlyLinkedList.size());
        System.out.println(singlyLinkedList);
    }

}

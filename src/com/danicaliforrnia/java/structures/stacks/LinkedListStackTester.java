package com.danicaliforrnia.java.structures.stacks;

public class LinkedListStackTester {

    public static void main(String[] args) {
        LinkedListStack<String> linkedListStack = new LinkedListStack<>();

        System.out.println("--------Test 1: Push---------");
        linkedListStack.push("A");
        linkedListStack.push("B");
        linkedListStack.push("C");
        linkedListStack.push("D");
        System.out.println("size: " + linkedListStack.size());
        System.out.println(linkedListStack);

        System.out.println("--------Test 2: Peek---------");
        System.out.println("Peek: " + linkedListStack.peek());
        System.out.println("Peek: " + linkedListStack.peek());

        System.out.println("--------Test 3: Pop---------");
        System.out.println("Pop: " + linkedListStack.pop());
        System.out.println("size: " + linkedListStack.size());
        System.out.println(linkedListStack);
        System.out.println("Pop: " + linkedListStack.pop());
        System.out.println("size: " + linkedListStack.size());
        System.out.println(linkedListStack);

        System.out.println("--------Test 2: Peek---------");
        System.out.println("Peek: " + linkedListStack.peek());
        System.out.println("Peek: " + linkedListStack.peek());
    }

}

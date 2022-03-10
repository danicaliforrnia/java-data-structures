package com.danicaliforrnia.java.structures.queues;

public class LinkedListQueueTester {

    public static void main(String[] args) {
        LinkedListQueue<String> linkedListQueue = new LinkedListQueue<>();

        System.out.println("--------Test 1: Enqueue---------");
        linkedListQueue.enqueue("A");
        linkedListQueue.enqueue("B");
        linkedListQueue.enqueue("C");
        linkedListQueue.enqueue("D");
        System.out.println("size: " + linkedListQueue.size());
        System.out.println(linkedListQueue);

        System.out.println("--------Test 2: Peek---------");
        System.out.println("Peek: " + linkedListQueue.peek());
        System.out.println("Peek: " + linkedListQueue.peek());

        System.out.println("--------Test 3: Dequeue---------");
        System.out.println("Dequeue: " + linkedListQueue.dequeue());
        System.out.println("size: " + linkedListQueue.size());
        System.out.println(linkedListQueue);
        System.out.println("Dequeue: " + linkedListQueue.dequeue());
        System.out.println("size: " + linkedListQueue.size());
        System.out.println(linkedListQueue);

        System.out.println("--------Test 4: Peek---------");
        System.out.println("Peek: " + linkedListQueue.peek());
        System.out.println("Peek: " + linkedListQueue.peek());

        System.out.println("--------Test 5: Dequeue---------");
        System.out.println("Dequeue: " + linkedListQueue.dequeue());
        System.out.println("size: " + linkedListQueue.size());
        System.out.println(linkedListQueue);
        System.out.println("Dequeue: " + linkedListQueue.dequeue());
        System.out.println("size: " + linkedListQueue.size());
        System.out.println(linkedListQueue);
        System.out.println("Dequeue: " + linkedListQueue.dequeue());
        System.out.println("size: " + linkedListQueue.size());
        System.out.println(linkedListQueue);
    }

}

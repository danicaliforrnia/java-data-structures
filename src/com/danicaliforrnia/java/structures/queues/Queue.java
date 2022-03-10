package com.danicaliforrnia.java.structures.queues;

public interface Queue<T> {
    /**
     * Insert an element to the Queue
     */
    void enqueue(T element);

    /**
     * Retrieve last element from the Stack
     */
    T peek();

    /**
     * Remove first entered element from the Queue
     */
    T dequeue();

    /**
     * @return true if is empty and false otherwise
     */
    boolean isEmpty();

    /**
     * @return size of the Stack
     */
    int size();
}

package com.danicaliforrnia.java.structures.stacks;

public interface Stack<T> {
    /**
     * Insert an element to the Stack
     */
    void push(T element);

    /**
     * Retrieve last element from the Stack
     */
    T peek();

    /**
     * Remove last element from the Stack
     */
    T pop();

    /**
     * @return true if is empty and false otherwise
     */
    boolean isEmpty();

    /**
     * @return size of the Stack
     */
    int size();
}

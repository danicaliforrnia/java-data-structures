package com.danicaliforrnia.java.structures.stacks;

import com.danicaliforrnia.java.structures.nodes.PointerNode;

public class LinkedListStack<T> implements Stack<T> {
    private PointerNode<T> head;
    private int size;

    public LinkedListStack() {
        head = null;
        size = 0;
    }

    /**
     * Insert last element to the stack. O(1)
     *
     * @param element: element to insert
     */
    @Override
    public void push(T element) {
        PointerNode<T> node = new PointerNode<T>(element);
        if (!isEmpty()) {
            node.setNext(head);
        }
        head = node;
        size++;
    }

    /**
     * Get last inserted element from the stack. O(1)
     *
     * @return element's value T
     */
    @Override
    public T peek() {
        return head.getData();
    }

    /**
     * Remove and return last inserted element from the stack. O(1)
     *
     * @return element's value T
     */
    @Override
    public T pop() {
        if (!isEmpty()) {
            var node = head;
            head = head.getNext();
            size--;
            return node.getData();
        } else {
            throw new IndexOutOfBoundsException("Empty Stack");
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            var current = head;
            stringBuilder.append("0: ");
            stringBuilder.append(current.getData());
            stringBuilder.append("\n");
            for (int i = 0; i < size - 1; i++) {
                current = current.getNext();
                stringBuilder.append(i + 1);
                stringBuilder.append(": ");
                stringBuilder.append(current.getData());
                stringBuilder.append("\n");
            }
            return stringBuilder.toString();
        } else {
            return "Empty Stack";
        }
    }
}

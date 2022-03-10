package com.danicaliforrnia.java.structures.queues;

import com.danicaliforrnia.java.structures.nodes.PointerNode;

public class LinkedListQueue<T> implements Queue<T> {
    private PointerNode<T> head;
    private PointerNode<T> tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Add element to the queue. O(1)
     *
     * @param element: element to insert.
     */
    @Override
    public void enqueue(T element) {
        PointerNode<T> node = new PointerNode<T>(element);
        if (isEmpty()) {
            head = node;
        } else {
            if (size != 1) {
                tail.setNext(node);
            }
            tail = node;
            if (size == 1) {
                head.setNext(tail);
            }
        }
        size++;
    }

    /**
     * Get first entered element from the queue. O(1)
     *
     * @return element's data T
     */
    @Override
    public T peek() {
        return head.getData();
    }

    /**
     * Get and remove first entered element from the queue. O(1)
     *
     * @return element's data T
     */
    @Override
    public T dequeue() {
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
            return "Empty Queue";
        }
    }
}

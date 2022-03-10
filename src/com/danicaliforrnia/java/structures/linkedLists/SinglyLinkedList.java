package com.danicaliforrnia.java.structures.linkedLists;

import com.danicaliforrnia.java.structures.nodes.PointerNode;

public class SinglyLinkedList<T> implements LinkedList<T> {
    private PointerNode<T> head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            return head.getData();
        }

        var node = head;

        for (int i = 0; i < index; i++) {
            node = head.getNext();
        }

        return node.getData();
    }

    /**
     * Insert at the tail or head if list is empty. O(1)
     * @param data: value to insert
     */
    @Override
    public void insert(T data) {
        if (isEmpty()) {
            head = new PointerNode<>(data);
        } else {
            var currentTail = head;

            for (int i = 0; i < size - 1; i++) {
                currentTail = currentTail.getNext();
            }

            currentTail.setNext(new PointerNode<>(data));
        }

        size++;
    }

    /**
     * Insert at index. O(n)
     * @param data:  data to insert
     * @param index: index where insert
     */
    @Override
    public void insert(T data, int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException(index);
        }

        PointerNode<T> node = new PointerNode<>(data);

        if (index == 0) {
            if (isEmpty()) {
                insert(data);
            } else {
                node.setNext(head);
                head = node;
                size++;
            }
        } else {
            var i = 0;
            var previous = head;

            while (i < index - 1) {
                previous = previous.getNext();
                i++;
            }

            node.setNext(previous.getNext());
            previous.setNext(node);
            size++;
        }
    }

    /**
     * Replace a value at index. O(n)
     * @param data:  data to replace
     * @param index: index where replace
     */
    @Override
    public void replace(T data, int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            head.setData(data);
        } else {
            var i = 0;
            var current = head;

            while (i < index) {
                current = current.getNext();
                i++;
            }

            current.setData(data);
        }
    }

    /**
     * Remove first appearance of data. O(n)
     * @param data: data to remove
     */
    @Override
    public void remove(T data) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }

        if (head.getData().equals(data)) {
            if (head.getNext() != null) {
                head = head.getNext();
            } else {
                head = null;
            }

            size--;
        } else {
            var current = head;
            PointerNode<T> previous = null;

            while (previous == null && current.getNext() != null) {
                if (current.getNext().getData().equals(data)) {
                    previous = current;
                } else {
                    current = current.getNext();
                }
            }

            if (previous != null) {
                previous.setNext(previous.getNext().getNext());
                size--;
            }
        }
    }

    /**
     * Remove at index. O(n)
     * @param index: index where remove
     */
    @Override
    public void remove(int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            head = head.getNext() != null ? head.getNext() : null;
        } else {
            var i = 0;
            var previous = head;

            while (i < index - 1) {
                previous = previous.getNext();
                i++;
            }

            previous.setNext(previous.getNext().getNext());
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private boolean isOutOfBounds(int index) {
        return index > size - 1 || (isEmpty() && index != 0);
    }

    public PointerNode<T> getHead() {
        return head;
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Head(0): ");
            stringBuilder.append(head.getData());

            if (size > 1) {
                stringBuilder.append("\n");

                var current = head;

                for (int i = 0; i < size - 2; i++) {
                    current = current.getNext();
                    stringBuilder.append(i + 1);
                    stringBuilder.append(": ");
                    stringBuilder.append(current.getData());
                    stringBuilder.append("\n");
                }

                current = current.getNext();
                stringBuilder.append("Tail(");
                stringBuilder.append(size - 1);
                stringBuilder.append("): ");
                stringBuilder.append(current.getData());
            }

            return stringBuilder.toString();
        } else {
            return "Empty Linked List";
        }
    }
}

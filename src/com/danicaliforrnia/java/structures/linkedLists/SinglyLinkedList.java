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
    public void insert(T data) {
        if (isEmpty()) {
            head = new PointerNode<>(data);
        } else {
            var current = head;
            for (int i = 0; i < size - 1; i++) {
                current = current.getNext();
            }
            current.setNext(new PointerNode<>(data));
        }
        size++;
    }

    @Override
    public void insert(T data, int index) {
        if (index > size - 1 || (isEmpty() && index != 0)) {
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

    @Override
    public void replace(T data, int index) {
        if (isEmpty()) {
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

    @Override
    public void remove(T data) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }

        if (head.getData().equals(data)) {
            head = head.getNext();
        } else {
            var previous = head;

            while (previous.getNext().getData().equals(data)) {
                previous = previous.getNext();
            }

            previous.setNext(previous.getNext().getNext() != null ? previous.getNext().getNext() : null);

        }

        size--;
    }

    @Override
    public void remove(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            head = size > 1 ? head.getNext() : null;
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

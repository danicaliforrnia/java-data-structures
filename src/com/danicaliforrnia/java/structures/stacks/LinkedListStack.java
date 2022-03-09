package com.danicaliforrnia.java.structures.stacks;

import com.danicaliforrnia.java.structures.nodes.PointerNode;

public class LinkedListStack<T> implements Stack<T> {
    private PointerNode<T> head;
    private int size;

    public LinkedListStack() {
        head = null;
        size = 0;
    }

    @Override
    public void push(T element) {
        PointerNode<T> node = new PointerNode<T>(element);
        if (!isEmpty()) {
            node.setNext(head);
        }
        head = node;
        size++;
    }

    @Override
    public T peek() {
        return head.getData();
    }

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
            return "Empty Stack";
        }
    }
}

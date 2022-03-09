package com.danicaliforrnia.java.structures.linkedLists;

import com.danicaliforrnia.java.structures.nodes.DoublePointerNode;

public class DoubleLinkedList<T> implements LinkedList<T> {
    private DoublePointerNode<T> head;
    private int size;

    public DoubleLinkedList() {
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

    @Override
    public void insert(T data) {
        if (isEmpty()) {
            head = new DoublePointerNode<>(data);
        } else {
            var newTail = new DoublePointerNode<>(data);
            var currentTail = head;
            for (int i = 0; i < size - 1; i++) {
                currentTail = currentTail.getNext();
            }
            currentTail.setNext(newTail);
            newTail.setPrevious(currentTail);
        }
        size++;
    }

    @Override
    public void insert(T data, int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException(index);
        }

        DoublePointerNode<T> node = new DoublePointerNode<>(data);

        if (index == 0) {
            if (isEmpty()) {
                insert(data);
            } else {
                node.setNext(head);
                node.getNext().setPrevious(node);
                head = node;
                size++;
            }
        } else {
            var i = 0;
            var current = head;

            while (i < index) {
                current = current.getNext();
                i++;
            }

            current.getPrevious().setNext(node);
            node.setPrevious(current.getPrevious());
            current.setPrevious(node);
            node.setNext(current);
            size++;
        }
    }

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

    @Override
    public void remove(T data) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }

        if (head.getData().equals(data)) {
            if (head.getNext() != null) {
                head = head.getNext();
                head.setPrevious(null);
            } else {
                head = null;
            }

            size--;
        } else {
            var found = false;
            var node = head;

            while (!found && node.getNext() != null) {
                node = node.getNext();

                if (node.getData().equals(data)) {
                    found = true;
                }
            }

            if (found) {
                if (node.getNext() != null) {
                    node.getPrevious().setNext(node.getNext());
                    node.getNext().setPrevious(node.getPrevious());
                } else {
                    node.getPrevious().setNext(null);
                }
                size--;
            }
        }
    }

    @Override
    public void remove(int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            head = size > 1 ? head.getNext() : null;
        } else {
            var i = 0;
            var current = head;

            while (i < index) {
                current = current.getNext();
                i++;
            }

            current.getPrevious().setNext(current.getNext());
            if (current.getNext() != null) {
                current.getNext().setPrevious(current.getPrevious());
            }
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

    public DoublePointerNode<T> getHead() {
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

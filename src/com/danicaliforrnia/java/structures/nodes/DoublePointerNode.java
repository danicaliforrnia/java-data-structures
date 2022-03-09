package com.danicaliforrnia.java.structures.nodes;

/**
 * @param <T>: Generic Type
 */
public class DoublePointerNode<T> extends Node<T> {
    private DoublePointerNode<T> next;
    private DoublePointerNode<T> previous;

    public DoublePointerNode() {
        super();
    }

    public DoublePointerNode(T data) {
        super(data);
    }

    public DoublePointerNode<T> getNext() {
        return next;
    }

    public void setNext(DoublePointerNode<T> next) {
        this.next = next;
    }

    public DoublePointerNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublePointerNode<T> previous) {
        this.previous = previous;
    }
}

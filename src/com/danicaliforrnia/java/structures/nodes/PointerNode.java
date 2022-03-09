package com.danicaliforrnia.java.structures.nodes;

/**
 * @param <T>: Generic Type
 */
public class PointerNode<T> extends Node<T> {
    private PointerNode<T> next;

    public PointerNode() {
        super();
    }

    public PointerNode(T data) {
        super(data);
    }

    public PointerNode<T> getNext() {
        return next;
    }

    public void setNext(PointerNode<T> next) {
        this.next = next;
    }
}

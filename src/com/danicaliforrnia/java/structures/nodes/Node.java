package com.danicaliforrnia.java.structures.nodes;

/**
 *
 * @param <T>: Generic Type
 */
public abstract class Node<T> {
    private T data;

    public Node() {

    }

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}

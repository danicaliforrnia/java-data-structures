package com.danicaliforrnia.java.structures.nodes;

/**
 * @param <K>: Key Generic Type
 * @param <T>: Data Generic Type
 */
public class HashNode<K, T> extends Node<T> {
    private K key;
    private HashNode<K, T> next;

    public HashNode() {
        super();
    }

    public HashNode(K key, T data) {
        super(data);
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public HashNode<K, T> getNext() {
        return next;
    }

    public void setNext(HashNode<K, T> next) {
        this.next = next;
    }
}

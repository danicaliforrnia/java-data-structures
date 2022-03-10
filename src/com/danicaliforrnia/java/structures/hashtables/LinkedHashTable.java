package com.danicaliforrnia.java.structures.hashtables;

import com.danicaliforrnia.java.structures.linkedLists.SinglyLinkedList;
import com.danicaliforrnia.java.structures.nodes.HashNode;

public class LinkedHashTable<K, T> implements HashTable<K, T> {
    private final double LOAD_FACTOR = 0.75;
    private final int CAPACITY_FACTOR = 2;
    private final int DEFAULT_CAPACITY = 16;
    private int capacity;
    private int size = 0;
    private SinglyLinkedList<HashNode<K, T>>[] buckets;

    public LinkedHashTable() {
        capacity = DEFAULT_CAPACITY;
        buckets = new SinglyLinkedList[capacity];
    }

    @Override
    public T get(K key) {
        int index = getIndex(key);
        if (buckets[index] == null) {
            return null;
        }
        if (buckets[index].size() == 1) {
            return buckets[index].getHead().getData().getData();
        } else {
            var current = buckets[index].getHead();
            if (current.getData().getKey().equals(key)) {
                return current.getData().getData();
            } else {
                boolean found = false;
                while (current.getNext() != null && !current.getData().getKey().equals(key)) {
                    current = current.getNext();
                    found = current.getData().getKey().equals(key);
                }
                return found ? current.getData().getData() : null;
            }
        }
    }

    @Override
    public void put(K key, T value) {
        int index = getIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new SinglyLinkedList<>();
        }
        buckets[index].insert(new HashNode<>(key, value));
        size++;
        resize();
    }

    @Override
    public boolean remove(K key) {
        int index = getIndex(key);
        if (buckets[index].size() == 1) {
            buckets[index].remove(0);
            size--;
            return true;
        } else {
            var current = buckets[index].getHead();
            if (current.getData().getKey().equals(key)) {
                buckets[index].remove(0);
                size--;
                return true;
            } else {
                boolean found = false;
                int i = 0;
                while (current.getNext() != null && !current.getData().getKey().equals(key)) {
                    current = current.getNext();
                    found = current.getData().getKey().equals(key);
                    i++;
                }
                if (found) {
                    buckets[index].remove(i);
                    size--;
                }
                return found;
            }
        }
    }

    @Override
    public boolean containsKey(K key) {
        int index = getIndex(key);
        if (buckets[index] == null) {
            return false;
        }
        if (buckets[index].size() == 1) {
            return !buckets[index].isEmpty();
        } else {
            return get(key) != null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    private void resize() {
        if (((double) size / capacity) >= LOAD_FACTOR) {
            capacity = capacity * CAPACITY_FACTOR;
            var tempBuckets = buckets;
            buckets = new SinglyLinkedList[capacity];
            for (SinglyLinkedList<HashNode<K, T>> element : tempBuckets) {
                put(element.getHead().getData().getKey(), element.getHead().getData().getData());
            }
        }
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (SinglyLinkedList<HashNode<K, T>> bucket : buckets) {
                if (bucket != null && !bucket.isEmpty()) {
                    if (bucket.size() == 1) {
                        stringBuilder.append("key: ");
                        stringBuilder.append(bucket.getHead().getData().getKey());
                        stringBuilder.append(", value: ");
                        stringBuilder.append(bucket.getHead().getData().getData());
                        stringBuilder.append("\n");
                    } else {
                        var current = bucket.getHead();
                        for (int i = 0; i < bucket.size(); i++) {
                            stringBuilder.append("key: ");
                            stringBuilder.append(current.getData().getKey());
                            stringBuilder.append(", value: ");
                            stringBuilder.append(current.getData().getData());
                            stringBuilder.append("\n");
                            if (i != bucket.size() - 1) {
                                current = current.getNext();
                            }
                        }
                    }
                }
            }
            return stringBuilder.toString();
        } else {
            return "Empty Hash Table";
        }
    }
}

package com.danicaliforrnia.java.structures.hashtables;

public interface HashTable<K, T> {
    /**
     * Get element mapped by a key.
     *
     * @param key: key with which the element is mapped.
     * @return T element's value or null if it is not found.
     */
    T get(K key);

    /**
     * Insert element to the table mapped by the key.
     *
     * @param key:   key with which the element is mapped.
     * @param value: element's value to insert.
     */
    void put(K key, T value);

    /**
     * Remove element mapped with key.
     *
     * @param key: key with which the element is mapped.
     * @return true is element is found and remove.
     */
    boolean remove(K key);

    /**
     * Check if exists an element mapped with key.
     *
     * @param key: key with which the element is mapped.
     * @return true is key is found, false otherwise.
     */
    boolean containsKey(K key);

    /**
     * Size of the hash table
     *
     * @return size
     */
    int size();

    /**
     * Check if hash table is empty.
     *
     * @return true if it is empty, false otherwise.
     */
    boolean isEmpty();
}

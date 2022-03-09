package com.danicaliforrnia.java.structures.linkedLists;

public interface LinkedList<T> {
    /**
     * Retrieve element at index.
     * @param index: element's index
     * @return T: element's data
     */
    T get(int index);

    /**
     * Insert data at the tail
     * @param data: value to insert
     */
    void insert(T data);

    /**
     * Insert data at an index
     * @param data: data to insert
     * @param index: index where insert
     */
    void insert(T data, int index);

    /**
     * Replace data at index
     * @param data: data to replace
     * @param index: index where replace
     */
    void replace(T data, int index);

    /**
     * Remove first appearance of data
     * @param data: data to remove
     */
    void remove(T data);

    /**
     * Remove data at index
     * @param index: index where remove
     */
    void remove(int index);

    /**
     * Get size of the LinkedList
     * @return size
     */
    int size();

    /**
     * Check is LinkedList is empty
     * @return true if LinkedList is empty
     */
    boolean isEmpty();
}

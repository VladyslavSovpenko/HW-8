package Hashmap;

import java.util.Objects;

public class Node<T, V> {
    private T key;
    private V value;
    int hash = 0;
    Node<T, V> next;

    public Node(int hash, T key, V value, Node<T, V> next) {
        this.key = key;
        this.value = value;
        this.hash = hash;
        this.next = next;
    }


    public T getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public final int hashCode() {
        return Objects.hashCode(key) ^ Objects.hashCode(value);
    }

    public Node<T, V> getNext() {
        return next;
    }

    public void setNext(Node<T, V> next) {
        this.next = next;
    }
}

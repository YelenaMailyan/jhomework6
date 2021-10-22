package com.company;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K, V> implements MyMap<K, V> {
    Node<K, V>[] arr = new Node[16];
    private int size;

    public String toDisplay() {
        String result = "";
        for (int i = 0; i < 16; i++) {
            if (arr[i] != null) {
                while (arr[i] != null) {
                    result = result + String.format("[K- %s,V- %s]", arr[i].getKey(), arr[i].getValue());

                    arr[i] = arr[i].getNext();
                }
            }
        }
        return result;
    }


    @Override
    public String toString() {
        return "MyHashMap{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void put(K inputKey, V inputValue) {
        Node<K, V> temp;
        temp = new Node<>(inputKey, inputValue);
        int index = temp.hash;


        //Entry newEntry = new Entry(key, value, null);
        if (arr[index] == null) {
            arr[index] = temp;
            size++;
        } else {
            Node<K, V> previous = null;
            Node<K, V> current = arr[index];
            while (current != null) {
                if (current.getKey().equals(inputKey)) {
                    current.setValue(inputValue);
                    break;
                }
                previous = current;
                current = current.getNext();
                size++;
            }
            if (previous != null)
                previous.setNext(temp);
        }

    }

    @Override
    public V get(K key) {

        int index = Objects.hashCode(key) % 16;
        if (arr[index] == null) {
            return null;
        } else {
            Node<K, V> current = arr[index];
            if (current.getKey().equals(key)) {
                return current.getValue();
            } else {
                current = current.getNext();
                return current.getValue();

            }

        }

    }

    public class Node<K, V> {
        int hash;
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.hash = Objects.hashCode(key) % 16;
            this.key = key;
            this.value = value;

        }

        public final K getKey() {
            return key;
        }

        public final V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }


    }
}





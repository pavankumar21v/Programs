package com.collections;

import java.util.Arrays;

public class ArrayListImpl<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object elements[];

    public ArrayListImpl() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public static void main(String[] args) {
        ArrayListImpl<Integer> list = new ArrayListImpl<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("BEFORE " + list.size);
        System.out.println(list.remove(2));
        System.out.println("AFTER " + list.size);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public E remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }

        E tmp = (E) elements[i];

        while (i < elements.length) {
            if (elements[i] != null) {
                elements[i] = elements[i + 1];
            }
            i++;
        }

        size--;
        return tmp;
    }
}
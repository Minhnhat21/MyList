package Buoi3.List;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {

    private static final int DEFAULT_SIZE = 10;

    private int size  = 0;

    private T[] elements;

    public MyArrayList() {
        this.elements = (T[]) new Object[DEFAULT_SIZE];
    }
    private void ensureCapacity() {
        int newSize = elements.length + DEFAULT_SIZE;
        elements = Arrays.copyOf(elements, newSize);
    }
    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public void add(T t) {
        if(this.size > elements.length) {
            ensureCapacity();
        }
        elements[size++] = t;
    }

    @Override
    public void add(int index, T t) {
        if(this.size > elements.length) {
            ensureCapacity();
        }
        for (int i = size; i >= index; i--) {
            elements[i] = elements[i-1];
        }
    }

    @Override
    public T remove(int index) {
        T temp = elements[index];
        elements[size] = null;
        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        this.size -= 1;
        return temp;

    }

    @Override
    public MyList<T> clone() {
        MyList<T> newList = new MyArrayList();
        for (int i = 0; i < size; i++) {
            newList.add(elements[i]);
        }
        return newList;

    }

    @Override
    public boolean contain(T t) {
        for (int i = 0; i < size; i++) {
            if(elements[i] == t) {
                return true;
            }
        }
        return  false;
    }

    @Override
    public int indexOf(T t) {
        for (int i = 0; i < size; i++) {
            if(elements[i] == t) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        this.size = 0;
    }
}

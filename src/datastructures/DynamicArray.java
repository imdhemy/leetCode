package datastructures;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class DynamicArray<T> {
    private T[] list;
    private int len;
    private int index;
    private int capacity;

    public DynamicArray(int capacity) {
        list = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    public DynamicArray() {
        list = (T[]) new Object[15];
        capacity = 15;
    }

    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void set(int index, T value) {
        list[index] = value;
    }

    public T get(int index) {
        return list[index];
    }

    public void add(T value) {
        if (index + 1 > capacity) expandSize();

        len++;
        list[index++] = value;
    }

    private void expandSize() {
        capacity *= 2;
        T[] newArr = (T[]) new Object[capacity];
        System.arraycopy(list, 0, newArr, 0, len);
        list = newArr;
    }

    public void clear() {
        Arrays.fill(list, null);
        len = 0;
    }

    public int indexOf(T value) {
        for (int i = 0; i < len; i++) if (value.equals(list[i])) return i;

        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) != -1;
    }
}

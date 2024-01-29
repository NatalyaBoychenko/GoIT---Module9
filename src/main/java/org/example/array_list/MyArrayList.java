package org.example.array_list;


import java.util.Arrays;

public class MyArrayList {


    private Object[] array = new Object[3];
    private int pointer = 0;

    public MyArrayList() {
    }

    public void add(Object value) {
        if (pointer == array.length - 1) {
            resize(array.length * 1.5);
        }
        array[pointer] = value;
        pointer++;
    }

    public Object remove(int index) {
        if (index < 0 || index >= array.length) {
            return null;
        }

        if (array.length == 0) {
            return null;
        }

        Object element = get(index);

        for (int i = index; i < pointer; i++) {
            array[i] = array[i + 1];
            array[pointer] = null;
        }
        pointer--;
        return element;
    }

    public void clear() {
        for (int i = 0; i < pointer; i++) {
            array[i] = null;
        }
        pointer = 0;
    }
    public int size() {
        return array.length;
    }

    public Object get(int index) {
        if (index < 0 || index >= array.length) {
            return null;
        }

        return array[index];
    }


    private void resize(double size) {

        array = Arrays.copyOf(this.array, (int) size);
    }

    public void printList() {

        System.out.println("MyArrayList: " + Arrays.toString(array));
    }

}

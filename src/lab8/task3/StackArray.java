package lab8.task3;

import java.util.Arrays;

public class StackArray<T> {

    private int currentElementPosition = 0;
    private Object[] elements;


    public StackArray() {
        int INITIAL_SIZE = 10;
        elements = new Object[INITIAL_SIZE];
    }


    public T pop() {
        //noinspection unchecked
        T t = (T) elements[--currentElementPosition];
        elements[currentElementPosition] = null;
        return t;
    }


    public void push(T elementToPush) {
        if (currentElementPosition == elements.length) {
            expandSize();
        }
        elements[currentElementPosition++] = elementToPush;
    }

    public T peak() {
        //noinspection unchecked
        return (T) elements[currentElementPosition];
    }

    public void clear() {
        while (currentElementPosition != 0) {
            elements[currentElementPosition] = null;
            --currentElementPosition;
        }
    }

    public boolean isEmpty() {
        return currentElementPosition == 0;
    }

    public boolean isFull() {
        return currentElementPosition == 10;
    }

    public int size() {
        return currentElementPosition;
    }


    private void expandSize() {
        int increasedSize = elements.length * 2;
        elements = Arrays.copyOf(elements, increasedSize);
    }
}

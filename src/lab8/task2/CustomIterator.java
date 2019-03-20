package lab8.task2;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {

    private Node<T> current;

    // initialize pointer to head of the list for iteration
    CustomIterator(CompanyList<T> list) {
        current = list.getHead();
    }

    // returns false if next element does not exist
    public boolean hasNext() {
        return current != null;
    }

    // return current data and update pointer
    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }
}

package lab8.task2;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {

    private Node<T> current;

    CustomIterator(CompanyList<T> list) {
        current = list.getHead();
    }

    public boolean hasNext() {
        return current != null;
    }

    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }
}

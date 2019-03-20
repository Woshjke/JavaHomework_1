package lab8.task2;

import java.util.Iterator;

public class CompanyList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;

    public void add(T data) {
        Node<T> node = new Node<>(data, null);
        if (head == null)
            tail = head = node;
        else {
            tail.setNext(node);
            tail = node;
        }
    }

    Node<T> getHead() {
        return head;
    }

    Node<T> getTail() {
        return tail;
    }

    public Iterator<T> iterator() {
        return new CustomIterator<>(this);
    }

}

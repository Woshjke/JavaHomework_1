package lab8.task2;

public class Node<T> {

    private T data;
    private Node<T> next;

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    // Setter getter methods for Data and Next Pointer
    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }
}

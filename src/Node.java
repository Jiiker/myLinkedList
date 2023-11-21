public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData(Node<T> node) {
        return node.data;
    }

    public Node<T> getNext(Node<T> node) {
        return node.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

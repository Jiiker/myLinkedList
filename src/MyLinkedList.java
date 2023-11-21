public class MyLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public void add(T data) {
        Node<T> node = new Node<>(data);

        if (size == 0)
        {
            head = node;
        }
        else
        {
            Node<T> cur = head;
            while(cur.getNext() != null)
            {
                cur = cur.getNext();
            }

            cur.setNext(node);
        }
        size++;
    }
}

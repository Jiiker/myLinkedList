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

    public T get(int index) {
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        else
        {
            Node<T> node = head;
            for (int i = 0; i < index; i++)
            {
                node = node.getNext();
            }
            return node.getData();
        }
    }

    public void delete(int index) {
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        else
        {
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++)
            {
                node = node.getNext();
            }

            node.setNext(node.getNext().getNext());
        }
    }
}

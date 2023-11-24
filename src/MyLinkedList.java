import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {
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

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            private Node<T> cur = head;

            @Override
            public boolean hasNext() {
                return cur != null;
            }

            @Override
            public T next() {
                if (!this.hasNext())
                {
                    throw new NoSuchElementException();
                }
                T data = cur.getData();
                cur = cur.getNext();
                return data;
            }
        };
    };
}

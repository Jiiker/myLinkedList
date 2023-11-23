import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));

        myLinkedList.delete(1);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));

        Iterator iter = myLinkedList.iterator();
        System.out.println(iter);
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        System.out.println(iter);
    }
}
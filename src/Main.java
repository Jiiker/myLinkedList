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

        for(Integer item : myLinkedList) {
            System.out.println("*************");
            System.out.println(item);
        }
    }
}
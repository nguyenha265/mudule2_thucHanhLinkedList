package MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(23);
        ll.add(11,20);
        ll.add(12,40);
        ll.add(13,60);

        ll.add(4,9);
        ll.add(4,9);


        System.out.println(ll.get(2).getData());

    }
}

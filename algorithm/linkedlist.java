class Node {
    Node next;
    int data;
    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    int count = 0;
    Node head;
    Node tail;

    int getCount() {
        return count;
    }
    void getValues() {
        for(Node temp = head; temp != null; temp=temp.next) {
            System.out.println("value : " + temp.data);
        }
    }
    void addFirst(int aValue) {
        if(head == null)
            addLast(aValue);
        else {
            Node temp = new Node(aValue);
            temp.next = head;
            head = temp;
            count++;
        }
    }
    void removeHead() {
        Node temp = head;
        head = head.next;
        temp = null;
        count--;
    }

    void remove(int aIndex) {
        if(aIndex == 0) {
            removeHead();
            return;
        }

        Node temp = head;
        for(int i=0; i<aIndex-1; i++) {
            temp=temp.next;
        }
        Node temp2 = temp.next.next;
        temp.next = temp2;
        count--;
    }
    void addData(int aValue, int aIndex) {
        Node temp = head;
        Node node = new Node(aValue);

        if(head == null)
            addLast(aValue);

        if(aIndex == 0) {
            addFirst(aValue);
            return;
        }

        for(int i=0; i<aIndex-1; i++) {
            temp=temp.next;
        }

        if(temp == null) {
            addLast(aValue);
            return;
        }
        Node temp2 = temp.next;
        node.next = temp2;
        temp.next = node;
        count++;
    }
    void addLast(int aValue) {
        Node node = new Node(aValue);
        if(head == null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = tail.next;
        }
        count++;
    }
}
public class Main {
    public static void main(String[] argc) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addData(100, 0);
        list.getValues();

        System.out.println(list.getCount());
        list.remove(2);
        list.getValues();
    }
}
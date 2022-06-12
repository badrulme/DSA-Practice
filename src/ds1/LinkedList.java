package ds1;

public class LinkedList {

    private Node head;
    private int length;

    public LinkedList() {
        this.head = null;
        this.length = 0;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private void add(int value) {
        add(value, length);
    }

    private void add(int value, int index) {

        if (index < 0 || index > length) return;

        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            length++;
            return;
        }

        Node currentNode = head;

        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }

        Node jointNode = currentNode.next;
        currentNode.next = newNode;
        newNode.next = jointNode;
        length++;
    }

    private void delete(int index) {

        if (index < 0 || index > length) return;

        if (index == 0) {
            head = head.next;
            length--;
            return;
        }

        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }

        currentNode.next = currentNode.next.next;

    }

    private void display() {
        System.out.println("===");
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(3, 2);
        linkedList.display();
        linkedList.delete(3);
        linkedList.display();
    }
}

package ds1;

public class CircularQueue {
    private int capacity;
    private int rear;
    private int front;
    private int[] array;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        rear = front = -1;
        array = new int[capacity];
    }

    public void enQueue(int e) {
        if (Boolean.TRUE.equals(isFull())) {
            System.out.println("Queue is full/ Overflow!");
            System.exit(0);
        }
        if (front == -1) {
            front = 0;
        }
        if (rear == capacity - 1) {
            rear = -1;
        }
        array[++rear] = e;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(0);
        }

        if (front == rear) front = rear = -1;

        int element = array[front];

        if (front == capacity - 1) front = -1;

        front++;

        return element;
    }

    public Boolean isEmpty() {
        return front == -1;
    }

    public Boolean isFull() {
        return ((front == 0 && capacity - 1 == rear) || (front == rear + 1));
    }

    public void printAllElement() {
        System.out.println("-----printAllElement-----");
        for (int e : array) {
            System.out.println(e + " ");
        }
    }

    public void printQueueElement() {
        System.out.println("-----printQueueElement-----");
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            int i;
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; rear != i; i = (i + 1) % capacity) {
                System.out.println(array[i] + " ");
            }
            System.out.println(array[i] + " ");
            System.out.println("Rear -> " + rear);
        }
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.deQueue();
        queue.enQueue(6);
        queue.printQueueElement();

    }
}

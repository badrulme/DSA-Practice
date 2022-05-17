package ds1;

public class Queue {
    private int[] array;
    private int front;
    private int rear;
    private int capacity;

    public Queue(int capacity) {
        front = -1;
        rear = -1;
        this.capacity = capacity;
        array = new int[capacity];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.displayAllElement();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.displayAllElement();
        System.out.println("Front: " + queue.front);
        System.out.println("Rear: " + queue.rear);
        queue.displayQueueElement();
        System.out.println("dequeue");
        System.out.println(queue.deQueue());
        queue.displayQueueElement();
        System.out.println("Peek: " + queue.peek());
    }

    public void enQueue(int e) {
        if (isFull()) {
            System.out.println("Queue is full");
            System.exit(0);
        }
        if (rear == -1) {
            front++;
        }
        array[++rear] = e;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        if (front == capacity - 1) {
            front = -1;
            rear = -1;
        }
        return array[front++];
    }

    public int peek() {
        return array[front];
    }

    public Boolean isEmpty() {
        return rear == -1;
    }

    public Boolean isFull() {
        return rear == capacity - 1;
    }

    public void displayAllElement() {
        System.out.println("----------");
        for (int e : array) {
            System.out.println(e + " ");
        }
    }

    public void displayQueueElement() {
        System.out.println("=========");
        for (int i = front; i <= rear; i++) {
            System.out.println(array[i] + " ");
        }
    }
}

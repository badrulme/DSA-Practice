package ds1;

public class Stack {
    private int array[];
    private int capacity;
    private int topIndex;

    public Stack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        topIndex = -1;
    }

    public Boolean isFull() {
        return topIndex + 1 == capacity;
    }

    public Boolean isEmpty() {
        return topIndex == -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("OverFlow\\nProgram Terminated\\n");
        }
        array[++topIndex] = x;
    }

    public int pop() {
        if (isEmpty()) System.out.println("Empty Stack");
        return array[topIndex--];
    }

    public int peek() {
        return array[topIndex];
    }

    public void printStackElements() {
        System.out.println("-----------");
        for (int i = 0; i <= topIndex; i++) {
            System.out.println(array[i] + " ");
        }
    }


    public static void main(String[] args) {
        Stack stack = new Stack(5);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStackElements();
        System.out.println(stack.pop());
        stack.printStackElements();
        System.out.println(stack.peek());
        stack.printStackElements();
    }


}

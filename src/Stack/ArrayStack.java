package Stack;


public class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public ArrayStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Add elements to stack
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full!");
            System.exit(1);
        }
        stack[++top] = item;
    }

    // Remove element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            System.exit(1);
        }
        return stack[top--];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Peek the top of the stack
    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.exit(1);
        }
        return -1;
    }

    // Size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());

        stack.pop();
        stack.pop();

        if (!stack.isEmpty()) {
            System.out.println("The top element is " + stack.peek());
        }

        System.out.println("The stack size is " + stack.size());
    }
}


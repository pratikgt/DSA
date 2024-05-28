public class Stacks {
    private int maxSize; // maximum size of the stack
    private int[] stackArray; // array to store stack elements
    private int top; // top of the stack

    // Constructor to initialize the stack
    public Stacks(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // stack is initially empty
    }

    // Push operation to add an element to the top of the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to the stack.");
        }
    }

    // Pop operation to remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // indicating stack is empty
        } else {
            return stackArray[top--];
        }
    }

    // Peek operation to return the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // indicating stack is empty
        } else {
            return stackArray[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Main method to demonstrate stack operations
    public static void main(String[] args) {
        Stacks stack = new Stacks(5); // Create a stack of size 5

        // Demonstrate stack operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // This will show that the stack is full

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());

        System.out.println("Top element is: " + stack.peek());

        stack.push(70);
        System.out.println("Top element is: " + stack.peek());

        // Empty the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped element is: " + stack.pop());
        }

        // Try to pop from an empty stack
        stack.pop();
    }
}
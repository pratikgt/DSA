public class Stks {
    private int[] stackArray;
    private int top;
    private int maxSize;

    public Stks(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full.Cannot push" + value);
            return;
        }
        stackArray[++top] = value;
    }

    // pop element
    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty.cannot pop");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("STAKC IS EMPTY");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);

    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        System.out.println("Stack ELements:");
        for (int i = 0; i <= top; i++) {
            System.out.println(stackArray[i] + "");
        }
        System.out.println("end is the beginning and the beginning is the end");
    }

    public static void main(String[] args) {
        Stks RS = new Stks(5);
        RS.push(10);
        RS.push(20);
        RS.push(30);
        RS.push(40);
        RS.push(50);
        RS.display();
        System.out.println("top element is " + RS.peek());

        RS.pop();
        RS.pop();
        RS.display();
        System.out.println("stack is empty" + RS.isEmpty());
        System.out.println("stack is full" + RS.isFull());

    }

}
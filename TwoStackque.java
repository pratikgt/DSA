public class TwoStackque {
    Stacks s1 = new Stacks(5);
    Stacks s2 = new Stacks(5);
    Stacks s3 = new Stacks(5);

    void enqueue(int data) {
        char dataChar = (char) data;
        s2.push(dataChar);
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s3 = s1;
        s1 = s2;
        s2 = s3;
    }

    int dequeue() {
        return s1.pop();
    }

}
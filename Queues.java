public class Queues {
    int front = -1;
    int rear = -1;
    int queue[];
    int size;

    Queues(int size) {
        this.size = size;
        queue = new int[size];
    }

    boolean isEmpty() {
        return front == -1;

    }

    boolean isFull() {
        return rear == size - 1;

    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("queue is full");
            return;

        } else {
            if (front == -1) {
                front = 0;

            }
            rear++;
            queue[rear] = data;

        }
    }

    int dequeue() {
        int data = 0;

        if (isEmpty()) {
            System.out.println("queue is empty");

        } else {
            data = queue[front];
            front++;
            if (front > rear) {
                front = rear = -1;
            }
        }
        return data;
    }

}

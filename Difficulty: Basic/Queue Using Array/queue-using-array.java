class myQueue {
    int[] arr;
    int front, rear, size;
    int count; // current number of elements

    // Constructor
    public myQueue(int n) {
        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public void enqueue(int x) {
        if (isFull()) return; // queue full, ignore as per earlier behavior

        // first element
        if (front == -1) front = 0;
        rear++;
        arr[rear] = x;
        count++;
    }

    public void dequeue() {
        if (isEmpty()) return; // nothing to do

        front++;
        count--;

        // reset pointers when queue becomes empty
        if (count == 0) {
            front = -1;
            rear = -1;
        }
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }
}



// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    
    private Node head;
    private Node end;
    private int count;

    public myQueue() {
        // Initialize your data members
        head = null;
        end = null;
        count = 0;
    }

    public boolean isEmpty() {
        // check if the queue is empty
        return count == 0;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node newNode = new Node(x);
        if(isEmpty()) {
            head = newNode;
            end = newNode;
        }
        else {
            end.next = newNode;
            end = newNode;
        }
        count++;
        
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(isEmpty()) return;
        head = head.next;
        count--;
        if(head == null) end = null;
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        return isEmpty() ? -1 : head.data;
    }

    public int size() {
        // Returns the current size of the queue.
        return count;
    }
}


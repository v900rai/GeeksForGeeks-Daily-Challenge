/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        Node newNode = new Node(val);

        // Case 1: insert at head
        if (pos == 1) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        int count = 1;

        // Traverse to (pos - 1)th node
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        // If position is valid (within list length + 1)
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }

        return head;
       
    }
}
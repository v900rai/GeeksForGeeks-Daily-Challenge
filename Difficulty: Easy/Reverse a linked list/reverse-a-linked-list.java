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
    Node reverseList(Node head) {
        Node prev =null;
        while(head != null){
            Node temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
}
/*

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class Solution {

    // Should rearrange given linked list such that all even
    // positioned Nodes are before odd positioned.
    // Returns nothing
    void rearrangeEvenOdd(Node head) {
        //  The task is to complete this method
        // RADHE RADHE 
        Node odd = head ; 
        Node even = head.next ; 
        Node evenHead = even ;
        while(even!=null && even.next!=null){
            odd.next = even.next ; 
            odd = odd.next ; 
            
            even.next = odd.next ; 
            even = even.next ; 
        }
        odd.next = evenHead ;
    }
}




// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
       Node current=head;
       Node prev=null;
       while(current!=null){
           Node next=current.next;
           current.next=prev;
           prev=current;
           current=next;
           }
           return prev;
    }
}

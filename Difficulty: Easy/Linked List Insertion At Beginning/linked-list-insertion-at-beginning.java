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
    public Node insertAtFront(Node head, int x) {
        // code here
        Node newNode=new Node(x);
        if(head==null){
            head=newNode;
            head.next=null;
        }
         else{
            newNode.next=head;
            head=newNode;
        }
        
        return head;
    }
}
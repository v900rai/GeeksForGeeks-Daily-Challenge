/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if (head == null) return null;
        
        Node curr = head;
        Node prv = null;
        
        if (x != 1){
          for(int i=1;i<x;i++){
              prv = curr;
              curr = curr.next;
          } 
            prv.next = curr.next;
        }else{
            
            return head.next;
        }
        
        return head;
    }
}
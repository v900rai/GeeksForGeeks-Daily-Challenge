/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
         if(head==null||head.next==null)
         {
             return head;
         }
         Node fastFwd=null;
         Node fwd=null;
         Node prev=null;
         Node curr=head;
         fwd=curr.next;
         if(fwd!=null)
         {
           fastFwd=fwd.next;
         }
         Node temp=pairwiseSwap(fastFwd); 
         curr.next=temp;
         fwd.next=curr;
         return fwd;
    }


}
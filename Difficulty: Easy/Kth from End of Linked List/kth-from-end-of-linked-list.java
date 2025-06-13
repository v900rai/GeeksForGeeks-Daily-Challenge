/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */



class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    public static int count(Node head){
         if(head == null) return 0;
        int smallCount = count(head.next);
        return 1 + smallCount;
     
    }
    int getKthFromLast(Node head, int k) {
        // Your code here
        int totalCount = count(head);
        int posFromFront = totalCount - k + 1;
        if(posFromFront <= 0) return -1;
        
        Node temp = head;
        for(int i = 1 ; i <= posFromFront -1 ; i++){
            temp = temp.next;
        }
        
        return temp.data;
    }
}
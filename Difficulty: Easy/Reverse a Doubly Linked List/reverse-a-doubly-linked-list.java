/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
       
       DLLNode curr = head;
        while(curr != null) {
            //Swapping of link
            DLLNode temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            
            if(curr.prev == null) head = curr;
            //Move to next node
            curr = curr.prev;
        }
        return head;   
    }
}
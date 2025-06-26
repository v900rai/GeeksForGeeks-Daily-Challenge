/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    void reorderlist(Node head) {
        if(head==null || head.next==null || head.next.next==null) 
            return;
            
        Node slow = head;
        Node fast = head;
        Node p = null;
        while(fast!=null && fast.next!=null){
            p = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node reverseH = null;
        if(fast==null) {
            reverseH = reverse(slow);
            p.next = null;
        } else {
            reverseH = reverse(slow.next);
            slow.next = null;
        }
        
        Node temp = new Node(-1);
        Node head1 = temp;
        int turn = 0;
        while(head!=null && reverseH!=null) {
            if(turn == 0) {
                temp.next = head;
                head = head.next;
                turn = 1;
            } else {
                temp.next = reverseH;
                reverseH = reverseH.next;
                turn = 0;
            }
            
            temp = temp.next;
        }
        
        while(head!=null) {
            temp.next = head;
            head = head.next;
            temp = temp.next;
        }
        
        while(reverseH!=null) {
            temp.next = reverseH;
            reverseH = reverseH.next;
            temp = temp.next;
        }
        
        head = head1.next;
        
    }
    
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        
        while(curr!=null) {
            Node f = curr.next;
            curr.next = prev;
            prev = curr;
            curr = f;
        }
        return prev;
    }
}
/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution {
    public Node rotate(Node head, int k) {
        //if(head==null) return null;
        if(head.next==null && head==null)
        return head;
        
        Node temp = head;
        Node tail = null;
        int size = 1;
        while(temp.next!=null) {
            size++;
            temp = temp.next;
        }
        tail = temp;
        
        temp = head;
        k = k%size;
        if(k==0) return head;
        while(k>1) {
            temp = temp.next;
            k--;
        }
        
        tail.next = head;
        Node p = temp.next;
        temp.next = null;
        
        return p;
    
    }
}


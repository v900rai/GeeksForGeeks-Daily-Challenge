/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    static Node reverse(Node head){
        Node curr=head,prev=null,ahead=null;
        while(curr!=null){
            ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
    }
    public static Node reverse(Node head, int k) {
        // code here
        int i=1;
        Node temp=head;
        while(i!=k){
            temp=temp.next;
            i++;
        }
        Node head2=temp.next;
        temp.next=null;
        Node head1=reverse(head);
        head2=reverse(head2);
        Node temp2=head1;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=head2;
        return head1;
        
    }
}



/* Link list Node
class Node
{
    Node next;
    int data;
    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

    /*You are required to complete this method*/
    class Solution {
    /*You are required to complete this method*/
    Node deleteK(Node head, int k) {
        // Your code here
        Node temp=head;
        Node dummy=new Node(0);
        Node point=dummy;
        int i=1;
        while(temp!=null){
            if(i==k){
                i=1;
            }
            else if(i<k){
                point.next=temp;
                point=temp;
                i++;
            }
            temp=temp.next;
        }
        point.next=null;
        return dummy.next;
    }

}
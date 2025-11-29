/*
The structure of node class is :
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public Node[] mergeList(Node head1, Node head2) {
        // write your code here, and print the result
        
         // write your code here, and print the result
        Node[] node=new Node[2];
        Node temp=head1;
        Node n=null;
        while(temp!=null&&head2!=null){
            n=temp.next;
            temp.next=head2;
            head2=head2.next;
            temp.next.next=n;
            temp=n;
        }
        
        node[0]=head1;
        node[1]=head2;
        return node;
    }
}
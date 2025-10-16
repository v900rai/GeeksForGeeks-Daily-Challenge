/* Node of a linked list
 class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }

}
*/
class Solution {
    /* Function to print nodes in a given Circular linked list */
    void printList(Node head) {
        if(head==null){
            return;
        }
        Node first=head;
        head=head.next;
        StringBuilder sb= new StringBuilder();
        sb.append(first.data);
        while(head!=null && head!=first){
            sb.append(" ");
            sb.append(head.data);
            head=head.next;
        }
        System.out.print(sb.toString());
    }
}
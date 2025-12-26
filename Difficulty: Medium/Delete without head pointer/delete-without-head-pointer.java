/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public void deleteNode(Node del) {
        if(del == null || del.next == null){
            return;
            
        }
        del.data = del.next.data;
        del.next = del.next.next;
        
    }
}
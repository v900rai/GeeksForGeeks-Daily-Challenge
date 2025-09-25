/*node class of the linked list
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
    public int GetNth(Node head, int index) {
        // Code here
        Node current=head;
        int count=0;
        while(current !=null){
            count++;
            if(count==index){
                return current.data;
            }
            current=current.next;
        }
        return -1;
    }
}
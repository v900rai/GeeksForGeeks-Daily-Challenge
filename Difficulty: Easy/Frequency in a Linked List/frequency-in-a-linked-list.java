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
}*/
// complete the below function
class Solution {
    public static int count(Node head, int key) {
        Node temp = head;
        int count = 0;
        while(temp!=null){
            if(temp.data == key){
                count++;
            }
            temp =temp.next;
        }
        return count;
        
    }
}
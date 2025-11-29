
/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public int[] displayList(Node head) {
        // code here
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        
        current = head;
        int[] list = new int[count];
        int index = 0;
        
        while (current != null) {
            list[index] = current.data;
            current = current.next;
            index++;
        }
        return list;
    }
}
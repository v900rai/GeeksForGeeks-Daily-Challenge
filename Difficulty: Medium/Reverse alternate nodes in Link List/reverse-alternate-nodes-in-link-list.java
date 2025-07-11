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
class Solution {
    public static void rearrange(Node odd) {
        Node extracted = null;
        while (odd.next != null) {
            Node newNext = odd.next.next;
            odd.next.next = extracted;
            extracted = odd.next;
            odd.next = newNext;
            if (newNext != null)
            odd = newNext;
        }
        odd.next = extracted;
}
}
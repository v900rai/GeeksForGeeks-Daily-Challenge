/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
         Node slow =  head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(fast==slow){
                int count = 1;
                fast=fast.next;
                while(fast!=slow){
                    count++;
                    fast=fast.next;
                }
                return count;
            }
        }
        return 0 ;
    }
}
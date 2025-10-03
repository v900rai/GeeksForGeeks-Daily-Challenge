/*
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/
class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        if (head == null) return head;
        Node ans = connectRandom(insertBetween(head));
        return computeFinal(ans);
        
    }
    public Node insertBetween(Node head){
        Node temp = head;
        while (temp != null){
            Node copyNode = new Node(temp.data);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }
        return head;
    }
    public Node connectRandom(Node head){
        Node temp = head;
        while (temp != null){
            Node copy = temp.next;
            if (temp.random != null) copy.random = temp.random.next;
            else copy.random = null;
            temp = temp.next.next;
        }
        return head;
    }
    public Node computeFinal(Node head){
        Node dummy = new Node(-1);
        Node res = dummy;
        Node temp = head;
        while (temp != null){
            res.next = temp.next;
            temp.next = temp.next.next;
            
            res = res.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}


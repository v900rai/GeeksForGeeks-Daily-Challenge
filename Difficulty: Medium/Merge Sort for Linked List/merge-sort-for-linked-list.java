/*
The structure of linked list is the following

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
    // Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head) {
        // add your code here
        Node cur=head;
        ArrayList<Integer>li=new ArrayList<>();
        while(cur!=null){
            li.add(cur.data);
            cur=cur.next;
        }
        Collections.sort(li);
        cur=head;
        int i=0;
        while(cur!=null){
            cur.data=li.get(i++);
            cur=cur.next;
        }
        return head;
    }
}


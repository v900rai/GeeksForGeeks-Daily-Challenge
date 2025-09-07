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
     Node mergeKLists(Node[] arr) {
        // code here
       List<Integer> li=new ArrayList<>();
       for(Node head:arr)
       {
           Node curr= head;
           while(curr!=null)
           {
               li.add(curr.data);
               curr=curr.next;
           }
       }
       Collections.sort(li);
       Node dummy= new Node(0);
       Node tail=dummy;
       for(Integer val:li)
       {
           tail.next=new Node(val);
           tail=tail.next;
       }
       return dummy.next;
    }

}
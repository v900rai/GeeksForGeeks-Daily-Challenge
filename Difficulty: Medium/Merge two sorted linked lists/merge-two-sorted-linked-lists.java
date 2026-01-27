/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
         if(head1==null) 
         return  head2;
          if(head2==null)
          return  head1;
         Node newHead=new Node(-1);
         Node dummy=newHead;
         while(head1!=null && head2!=null){
              if(head1.data<=head2.data){
                  dummy.next=head1;
                  head1=head1.next;
              }
              else{
                  dummy.next=head2;
                  head2=head2.next;
              }
             dummy=dummy.next; 
         }
          if(head1!=null){
              dummy.next=head1;
          }
          else{
                 dummy.next=head2;
          }
       return    newHead.next;
    }
}
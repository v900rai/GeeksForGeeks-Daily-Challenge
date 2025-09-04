



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
    public static Node reverseKGroup(Node head, int k) {
       Node curr=head;
       Node prev=null;

        while(curr!=null){

          Node nth=findNth(curr,k);

          if(nth==null){

              Node rev= reverseList(curr);

              if(prev!=null) prev.next=rev;

              else return rev;

              break;

          }

          Node nthNext=nth.next;

          nth.next=null;

          Node rhead= reverseList(curr);

          if(curr==head) head=rhead;

          else prev.next=rhead;

          prev=curr;

          curr=nthNext;

        }

        return head;

    }

    // public static Node findNth(Node curr, int n){

    //     for(int i=0;i<n-1;i++){

    //         if(curr==null) 
    //         return null;

    //         curr=curr.next;

    //     }

    //     return curr;

    // }
    public static Node findNth(Node curr, int n){
        for(int i=0; i<n-1; i++){
            if(curr ==null)
                return null;
                
                curr =curr.next;
            
        }
        return curr;
    }

    public static Node reverseList(Node curr){

        Node prev=null;

        while(curr!=null){

          Node next=curr.next;

            curr.next=prev;

            prev=curr;

            curr=next;

        }

        return prev;
    }
}

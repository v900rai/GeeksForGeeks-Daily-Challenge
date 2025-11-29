

// User function Template for Java

/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/

class Solution {
   public Node moveZeroes(Node head) {
        // Your Code here.
        ArrayList<Integer> ll=new ArrayList<Integer>();
        
        int count0=0;
        Node temp=head;
        
        while(temp!=null){
            if(temp.data==0){
                count0++;
            }else{
                ll.add(temp.data);
            }
            temp=temp.next;
        }
        
        temp=head;
        int i=0,j=0;
        while(temp!=null){
            if(i<count0){
                temp.data=0;
                i++;
            }else{
                temp.data=ll.get(j);
                j++;
            }
            temp=temp.next;
        }
        
        return head;
    }
}
/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    public static Node findUnion(Node head1, Node head2) {
        // Add your code here.
        TreeSet<Integer>set=new TreeSet<>();
        Node temp;
        temp=head1;
        while(temp.next!=null)
        {
            set.add(temp.data);
            temp=temp.next;
        }
        set.add(temp.data);
         temp=head2;
        while(temp.next!=null)
        {
            set.add(temp.data);
            temp=temp.next;
        }
        set.add(temp.data);
        //int n=set.size();
         temp=head1;
        int count=0;
        Node head;
        head=null;
        for(Integer m:set)
        {
            Node n=new Node(m);
            temp.next=n;
            temp=n;
            if(count==0)
            {
                head=temp;
                count=1;
            }
            
            
        }
        return head;
    }
}


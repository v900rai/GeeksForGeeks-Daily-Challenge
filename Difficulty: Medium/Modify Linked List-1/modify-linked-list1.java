class Solution {
    public static Node modifyTheList(Node head) {
        // code here
        if(head==null || head.next==null) return head;
        
        Node s=head,f=head;
        while(f.next!=null && f.next.next!=null){
            f=f.next.next;
            s=s.next;
        }
        
        Node n=s.next;
        s.next=null;
        Node middle =null;
        if(f.next==null) middle=s;
        n=reverse(n);
        
        Node t=head,y=n;
        while(t!=middle){
            int x=t.data;
            t.data=y.data-x;
            y.data=x;
            t=t.next;
            y=y.next;
        }
        n=reverse(n);
        s.next=n;
        
        return head;
    }
    static Node reverse(Node h){
        if(h==null || h.next==null) return h;
        Node t=h,p=null;
        while(t!=null){
            Node n =t.next;
            t.next=p;
            p=t;
            t=n;
        }
        return p;
    }
}


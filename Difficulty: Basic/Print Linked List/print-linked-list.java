/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> list=new ArrayList<>(); 
        return rec(head,list);
    }
    static ArrayList<Integer> rec(Node head,ArrayList<Integer>list){
        if(head==null){
            return list;
        }
        list.add(head.data);
        return rec(head.next,list);
    }
}
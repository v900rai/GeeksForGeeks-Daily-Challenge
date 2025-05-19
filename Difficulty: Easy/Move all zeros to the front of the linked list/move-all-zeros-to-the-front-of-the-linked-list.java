//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Zeroes {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution g = new Solution();
            head = g.moveZeroes(head);
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


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
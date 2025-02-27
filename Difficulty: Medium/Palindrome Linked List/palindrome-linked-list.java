//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Driver_code {
    static Node insert(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return head;
        } else {
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = temp;
        }
        return head;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            Node head = null;

            String str[] = read.readLine().trim().split(" ");
            int listSize = str.length;
            for (int i = 0; i < listSize; i++) {
                head = insert(head, Integer.parseInt(str[i]));
            }
            boolean f = new Solution().isPalindrome(head);

            System.out.println(f ? "true" : "false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Function to check whether the linked list is a palindrome.
    boolean isPalindrome(Node head) {
        // अगर लिस्ट खाली है या केवल एक ही एलिमेंट है, तो यह palindrome ही होगी।
        if (head == null || head.next == null) return true;

        // 1. Stack का उपयोग करके Linked List के सभी data values को store करते हैं।
        Stack<Integer> st = new Stack<Integer>();
        Node temp = head;

        // Linked List को traverse करके values को stack में push करना
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        // 2. अब फिर से Linked List को traverse करेंगे और stack से values match करेंगे।
        temp = head;
        while (temp != null) {
            // Stack के टॉप से डेटा निकाल कर compare करना
            if (temp.data != st.peek()) {
                return false; // अगर data match नहीं करता तो यह palindrome नहीं है।
            }
            temp = temp.next;
            st.pop(); // Stack से टॉप element को remove करना
        }

        return true; // अगर पूरे लूप में कोई mismatch नहीं मिला, तो list palindrome है।
    }
}

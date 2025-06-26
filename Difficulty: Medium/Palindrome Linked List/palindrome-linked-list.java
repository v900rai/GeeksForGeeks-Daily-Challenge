

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
        if (head == null || head.next == null) 
            return true;

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

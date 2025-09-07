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
    public int lengthOfLoop(Node head) {
        // Step 1: Initialize slow and fast pointers
        Node slow = head;
        Node fast = head;

        // Step 2: Use Floyd’s Cycle Detection Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;           // move slow by 1 step
            fast = fast.next.next;      // move fast by 2 steps

            // Step 3: If slow and fast meet, loop is detected
            if (fast == slow) {
                int count = 1;
                fast = fast.next;       // move fast one step ahead

                // Step 4: Count the number of nodes in the loop
                while (fast != slow) {
                    count++;
                    fast = fast.next;
                }

                return count; // return loop length
            }
        }

        // If no loop is present
        return 0;
    }
}



/*
class Node
{
    int data;
    Node next;
}
*/
 

class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        if (head==null && head.next==null) {
            return; // No loop possible in an empty list or a single-node list.
        }

        Node slow = head;
        Node fast = head;

        // Step 1: Detect the loop using slow and fast pointers.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Loop detected.
            if (slow == fast) {
                break;
            }
        }

        // If no loop is detected, return.
        if (fast == null || fast.next == null) {
            return;
        }

        // Step 2: Find the starting node of the loop.
        slow = head;
        if (slow == fast) {
            // Special case: The loop starts at the head node.
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            // General case: Move slow and fast one step at a time.
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        // Step 3: Break the loop by setting the next of the last node in the loop to null.
        fast.next = null;
    }
}
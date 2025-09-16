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
        Node slow = head;   // kachua
        Node fast = head;   // khargosh

        // Step 1: Detect loop using Floyd’s Cycle Detection
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Loop detected
                break;
            }
        }

        // If no loop found, just return
        if (fast == null || fast.next == null) {
            return;
        }

        // Step 2: Find starting node of the loop
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Find last node in loop and break the loop
        Node loopNode = slow;
        Node temp = loopNode;
        while (temp.next != loopNode) {
            temp = temp.next;
        }

        // Break the loop
        temp.next = null;
    }
}

class Solution {
    public static void removeLoop(Node head) {

        if (head == null || head.next == null)
            return;

        Node slow = head;
        Node fast = head;

        // Step 1: Detect loop
        boolean hasLoop = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }

        // Agar loop hi nahi hai
        if (!hasLoop)
            return;

        // Step 2: Find starting point of loop
        slow = head;

        // Special case: loop starts at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            // Normal case
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        // Step 3: Remove loop
        fast.next = null;
    }
}
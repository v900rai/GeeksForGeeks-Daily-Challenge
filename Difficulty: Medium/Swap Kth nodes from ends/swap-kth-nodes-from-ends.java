//{ Driver Code Starts
import java.io.*; // Import for BufferedReader, InputStreamReader, and IOException
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void addressStore(Node[] arr, Node head) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            arr[i] = temp;
            i++;
            temp = temp.next;
        }
    }

    public static boolean check(Node[] before, Node[] after, int num, int k) {
        if (k > num) return true;

        for (int i = 0; i < num; i++) {
            if ((i == k - 1) || (i == num - k)) {
                if (!((before[k - 1] == after[num - k]) &&
                      (before[num - k] == after[k - 1]))) {
                    return false;
                }
            } else {
                if (before[i] != after[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader to read input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            // Parse input line into integers
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            int k = Integer.parseInt(br.readLine());

            // Create the linked list
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }

            int num = arr.size();
            Node[] before = new Node[num];
            addressStore(before, head);

            Solution ob = new Solution();
            head = ob.swapKthNode(head, k);

            Node[] after = new Node[num];
            addressStore(after, head);

            // Check if the swap was successful
            if (check(before, after, num, k)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java


class Solution { 
    public Node swapKthNode(Node head, int k) { 
    if (head == null || k <= 0) 
        return head; 
// Step 1: Count the number of nodes in the list 
    int count = 0;
    Node curr = head; 
    while (curr != null) {
        count++; 
        curr = curr.next; 
        
    } 
// If k is more than the number of nodes, return head 
    if (k > count) return head; 
// Step 2: Find the k-th node from the beginning and the end 
    Node first = head, firstPrev = null; 
    for (int i = 1; i < k; i++) {
        firstPrev = first; 
        first = first.next; 
        
    } 
    Node second = head, secondPrev = null;
    for (int i = 1; i < count - k + 1; i++) {
        secondPrev = second;
        second = second.next; 
        
    } 
// Step 3: Swap the k-th nodes from the beginning and end 
    if (firstPrev != null) 
        firstPrev.next = second; 
    if (secondPrev != null) 
        secondPrev.next = first; 
    Node temp = first.next; 
    first.next = second.next; 
    second.next = temp; 
// If k-th node from the beginning is the head of the list 
    if (k == 1) 
        head = second; 
// If k-th node from the end is the head of the list 
    if (k == count) 
        head = first; 
    return head;
    }
}


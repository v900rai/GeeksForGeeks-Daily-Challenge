/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
public static Node reverse(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node next = null;
        
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        int carry = 0;
        
        Node rev1 = reverse(num1);
        Node rev2 = reverse(num2);
        
        Node head = null;
        Node tail = head;
        
        while(rev1 != null || rev2 != null || carry != 0)
        {
            int val1 = 0;
            int val2 = 0;
            if(rev1 != null) val1 = rev1.data;
            if(rev2 != null) val2 = rev2.data;
            
            int sum = val1 + val2 + carry;
           
            int digit = sum % 10;
            carry = sum / 10;
            Node temp = new Node(digit);
            
            if(head == null)
            {
                head = temp;
                tail = temp;
            }
            else
            {
                tail.next = temp;
                tail = temp;
            }
            
            if(rev1 != null) rev1 = rev1.next;
            if(rev2 != null) rev2 = rev2.next;
        }
        
        
        Node result = reverse(head);
        
        while(result != null)
        {
            if(result.data != 0)
            break;
            result = result.next;
        }
        
        return result;
    
    }
}

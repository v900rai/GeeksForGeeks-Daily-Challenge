/* Structure of linked list node
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
    Node compute(Node head) {
        // code here
        Stack<Node> st = new Stack<>();
        
        Node root = head;
        while(root != null){
            
            while(!st.isEmpty() && st.peek().data < root.data){
                st.pop();
            }
            if(!st.isEmpty()){
                st.peek().next = root;
            }
            st.push(root);
            root = root.next;
        }
        
        while(!st.isEmpty()){
            head = st.pop();
        }
        return head;
    }
}
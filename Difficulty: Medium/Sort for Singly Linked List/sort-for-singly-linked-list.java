// User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution {
    public static Node insertionSort(Node head_ref) {
        // code here
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        Node temp = head_ref;
        
        while(temp!=null){
            array.add(temp.data);
            temp = temp.next;
        }
        
        Collections.sort(array);
        
        Node temp2 = head_ref;
        while(temp2!=null){
            for(int i=0;i<array.size();i++){
                temp2.data = array.get(i);
                temp2 = temp2.next;
            }
        }
        
        return head_ref;
    }
}
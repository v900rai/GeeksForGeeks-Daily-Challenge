

// User function Template for Java
/*class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// arr is an array of Nodes of the heads of linked lists

class Solution {
    // Function to merge K sorted linked list.
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        List<Node>ans=new ArrayList<>();
        for(int i=0;i<arr.size();i++)
        {
            Node j=arr.get(i);
            while(j!=null)
            {
                ans.add(j);
                j=j.next;
            }
        }
        Collections.sort(ans,(a,b)->(a.data-b.data));
        Node res=new Node(-1);
        Node temp=res;
        for(Node i:ans)
        {
            temp.next=i;
            temp=temp.next;
        }
        return res.next;
    }
}
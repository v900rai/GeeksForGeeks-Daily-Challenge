



//User function Template for Java

/* class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/

//This function should return head to the DLL

class Solution

{
    Node pre =null;
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
		if(root==null){
		    return null;
		}
		Node head=bToDLL(root.left);
		if(pre== null) head=root;
		else{
		    root.left=pre;
		    pre.right=root;
		}
		pre=root;
		bToDLL(root.right);
		return head;
    }
}
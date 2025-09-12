/*complete the given function*/

/* class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution 
{
    public static boolean isSame(Node T, Node S)
    {
        if(T == null && S == null)
        {
            return true;
        }
        
        if(T == null || S == null)
        {
            return false;
        }
        if(T.data == S.data)
        {
            return isSame(T.left, S.left) && isSame(T.right, S.right);
        }
        
        return false;
    }
    public static boolean isSubtree(Node T, Node S) 
    {
        // add code here.
        if(S == null) 
        {
            return true;
        }
        
        if(T == null) 
        {
            return false;
        }
        
        if(T.data == S.data)
        {
            if(isSame(T,S))
            {
                return true;
            }
        }
        
        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }
}


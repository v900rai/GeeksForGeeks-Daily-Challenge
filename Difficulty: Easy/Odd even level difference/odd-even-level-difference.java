/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution
{
    int getLevelDiff(Node root)
    {
        //code here
        int o=0,e=0,level=0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int l = q.size();
            level++;
            for(int i=0;i<l;i++){
                Node x = q.poll();
                if(x.left!=null) q.offer(x.left);
                if(x.right!=null) q.offer(x.right);
                if(level%2==0){
                    e+=x.data;
                }else{
                    o+=x.data;
                }
            }
        }
        return o-e;
    }
}
/* Structure of binary tree node
class Node{
public:
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList <Integer> verticalSum(Node root) {
        Queue<Pair>q = new LinkedList<>();
        HashMap<Integer, Integer>map = new HashMap<>();
        if(root!=null) q.add(new Pair(0, root));
        
        while(!q.isEmpty()){
            int size = q.size();
            while(size>0){
                Pair p = q.remove();
                Node node = p.node;
                int x = p.x;
                map.put(p.x, map.getOrDefault(x, 0)+node.data);
                if(node.left!=null)q.add(new Pair(x-1, node.left));
                if(node.right!=null)q.add(new Pair(x+1, node.right));
                size--;
            }
        }
      
       
        ArrayList<Integer>a= new ArrayList<>();
        for(int n: map.keySet()){
            a.add(n);
        }
        Collections.sort(a);
        ArrayList<Integer>res= new ArrayList<>();
        for(int n: a){
            res.add(map.get(n));
        }
        return res;
        
    }
    
    class Pair{
        int x;
        Node node;
        Pair(int x, Node node){
            this.x =x;
            this.node = node;
        }
    }
}
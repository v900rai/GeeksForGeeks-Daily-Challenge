class Solution {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public ArrayList<String> huffmanCodes(String S, int f[], int N) {
        ArrayList<String> preorder = new ArrayList<>();
        
        PriorityQueue<TreeNode> pq = new PriorityQueue<>((x, y) -> x.data < y.data ? -1 : 1);
        Arrays.stream(f).forEach(x -> pq.offer(new TreeNode(x)));
        
        while (pq.size() > 1) {
            TreeNode l = pq.poll();
            TreeNode r = pq.poll();
            
            TreeNode mergedNode = new TreeNode(l.data + r.data);
            
            mergedNode.left = l;
            mergedNode.right = r;
            pq.offer(mergedNode);
        }
        
        TreeNode root = pq.poll();
        traverseForCodes(root, preorder, "");
        return preorder;
    }
    
    void traverseForCodes(TreeNode root, ArrayList<String> pre, String code) {
        if (root.left == root.right) {
            pre.add(code);
            return;
        }
        traverseForCodes(root.left, pre, code + "0");
        traverseForCodes(root.right, pre, code + "1");
    }
}


// User function Template for Java

class Solution {
    public Node sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0){
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length-1);
        
       
    }
    private Node sortedArrayToBST(int nums[], int left, int right){
        if(left>right){
            return null;
        }
            int mid=left+(right-left)/2;
            Node root=new Node(nums[mid]);
            root.left= sortedArrayToBST(nums, left,mid-1);
            root.right= sortedArrayToBST(nums,mid+1,right);
            return root;
        }
    
}
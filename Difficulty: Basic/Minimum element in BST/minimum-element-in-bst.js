

// User function Template for javascript

/**
 * @param {Node} root
 * @returns {number}
*/

class Solution {
    // Function to find the minimum element in the given BST.
    minValue(root) {
        // your code here
        let temp;
        if(root===null){
            return -1;
        }
        return this.find(root);
    }

find (root){
    if(root.left===null){
        return root.data;
    }
    else{
        return this.find(root.left);
    }
}
}
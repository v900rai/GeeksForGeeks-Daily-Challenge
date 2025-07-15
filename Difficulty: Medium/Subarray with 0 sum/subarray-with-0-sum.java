

class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
       HashSet <Integer> ans = new HashSet<>();
        int prefix = 0;
        for(int nums :arr){
            prefix += nums;
            if(prefix ==0|| ans.contains(prefix)) return true;
            ans.add(prefix);
        }
        return false;
    }
}
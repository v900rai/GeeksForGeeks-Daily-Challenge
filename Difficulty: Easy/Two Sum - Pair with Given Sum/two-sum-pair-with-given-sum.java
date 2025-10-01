class Solution {
    boolean twoSum(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) { // i+1 se start karna sahi hai
                if (arr[i] + arr[j] == target)
                    return true;  // pair mil gaya
            }
        }
        return false; // nahi mila
    }
}

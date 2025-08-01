

// User function Template for Java



class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // Result list to store the pair
        List<Integer> result = new ArrayList<>();
        
        // Base case: if the array has fewer than 2 elements
        if (arr == null || arr.length < 2) {
            return result; // base case
        }
        
        // Sort the array
        Arrays.sort(arr);
        
        int start = 0;
        int end = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int minDifference = Integer.MAX_VALUE;
        
        while (start < end) {
            int sum = arr[start] + arr[end];
            int difference = Math.abs(target - sum);
            
            // Update closest sum if a closer difference is found
            if (difference < minDifference) {
                minDifference = difference;
                closestSum = sum;
                result.clear(); // Clear previous results
                result.add(arr[start]);
                result.add(arr[end]);
            }
            
            // Adjust pointers
            if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        
        return result;
    }
}

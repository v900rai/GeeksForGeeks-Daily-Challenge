// User function Template for Java

/*
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
*/

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        
        Arrays.sort(arr1);
        List<pair> ans = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        for(int i=0; i<arr2.length; i++) {
            hash.put(arr2[i], hash.getOrDefault(arr2[i], 0) + 1);
        }
        
        for(int i=0; i<arr1.length; i++) {
            int complement = target - arr1[i];
            if(hash.containsKey(complement)) {
                int val = hash.get(complement);
                
                for(int j=1; j<=val; j++) {
                    ans.add(new pair(arr1[i], target - arr1[i]));
                }
            }
        }
        
        return ans.toArray(new pair[0]);
        
    }


}
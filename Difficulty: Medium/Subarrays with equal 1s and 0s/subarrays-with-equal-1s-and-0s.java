// User function Template for Java

class Solution {
    // Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n) {
        // add your code here
         HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        m.put(0,1);
        int ans=0;
        int s=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
            if(m.containsKey(s)){
                ans+=m.get(s);
            }
            m.put(s,m.getOrDefault(s,0)+1);
        }
        return ans;
    }
}

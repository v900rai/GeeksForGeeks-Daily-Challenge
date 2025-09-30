class Solution {
    public int maxDistance(int[] arr) {
     int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int ind=map.get(arr[i]);
                int t1=i-ind;
                ans=Math.max(t1,ans);
            }else {
                map.put(arr[i],i);
            }
        }
        return ans;
    }
}

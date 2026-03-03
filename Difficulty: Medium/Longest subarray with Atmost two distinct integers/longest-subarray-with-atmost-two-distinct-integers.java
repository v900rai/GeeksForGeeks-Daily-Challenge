

class Solution {
    public int totalElements(int[] arr) {
        // code here
        int ans=0;
        int j=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
              int x=arr[i];
              mp.put(x,mp.getOrDefault(x,0)+1);
              if(mp.size()>2){
                   int y=arr[j];
                   mp.put(y,mp.get(y)-1);
                   if(mp.get(y)==0){
                       mp.remove(y);
                   }
                   j++;
              }
              ans=Math.max(ans,(i-j+1));
        }
        
        return ans;
    }
}


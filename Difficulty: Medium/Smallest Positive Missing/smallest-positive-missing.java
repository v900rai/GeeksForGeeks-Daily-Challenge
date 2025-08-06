class Solution {
    public int missingNumber(int[] arr) {
        Map<Integer,Integer> hp=new TreeMap<>();
        int int_max=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
                } 
        }
        
        if(hp.size()==0) return 1;
        
        for(int i=1;i<int_max;i++){
            if(!hp.containsKey(i)){
                return i;
            }
        }
        
        return 1;
        
    }
}
class Solution {

    // Function to find minimum number of attempts needed in
    // order to find the critical floor.
    static int eggDrop(int n, int k) {
        // Your code here
        int min = 101;
        
        for(int i=1;i<=k;i++){
            int temp = find(n,1,i,k);
            if(min>temp){
                min = temp;
            }
        }
        return min;
        
    }
    
    static int find(int n , int start ,int mid, int end){
        
        if(n==1 ||mid==1){
            return end-start+1;
        }
        
        if(start>end){
            return 0;
        }
        
        int broken = find(n-1,start,(start+mid-1)/2 , mid-1);
        int notBroken = find(n,mid+1,(mid+1+end)/2,end);
        
        return 1+Math.max(broken,notBroken);
        
    }
}
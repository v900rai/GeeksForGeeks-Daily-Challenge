class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        int steps =0 ; 
        if(n==1) { return 1 ; } 
        steps = towerOfHanoi(n-1 , from , aux , to) ; 
        
        steps++ ; 
        
        steps+= towerOfHanoi(n-1 ,  aux , to , from ) ;
        return steps ; 
    }
}
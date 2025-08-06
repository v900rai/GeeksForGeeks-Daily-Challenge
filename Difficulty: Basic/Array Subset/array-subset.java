

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
      // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i=0;
        int j=0;
        
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                i++;
                j++;
            }else{
                i++;
            }
        }
        if(j==b.length) return true;
        return false;
    
    }
}
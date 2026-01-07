
class Solution {
    public boolean isSubset(int a[], int b[]) {
       Arrays.sort(a);
       Arrays.sort(b);
        int i=0;
        int j=0;
        int count = 0;
        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
            count++;
            i++;
            j++;
            }
            else{
            i++;
            }
            
            
        }
        if(count == b.length){
            return true;
        }
        return false;
        
    }
}

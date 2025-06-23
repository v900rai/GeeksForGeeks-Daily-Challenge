

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;
        int i = 0, j =0;
        for(;i<a.length && j < b.length;i++){
            if(a[i] == b[j]){
                count++;
                j++;
            }
        }
        return count==b.length;
    }
}
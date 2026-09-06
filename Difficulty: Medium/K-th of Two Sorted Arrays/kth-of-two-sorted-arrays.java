

// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int arr[] = new int[a.length+b.length];
        System.arraycopy(a,0,arr,0,a.length);
        System.arraycopy(b,0,arr,a.length,b.length);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
        if(i==k-1){
            return arr[i];
        }
        }
        return 0;
    }
}
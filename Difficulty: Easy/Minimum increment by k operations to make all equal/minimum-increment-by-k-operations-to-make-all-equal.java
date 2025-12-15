class Solution {

    static int minOps(int arr[], int k) {

        // Your code here
        int largest=arr[0];
        int n=arr.length;
        for(int i=1;i<=n-1;i++)
        {
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        int count=0;
        for(int i=0;i<=n-1;i++)
        {
            int a=largest-arr[i];
            
            if(a%k!=0)
            {
                return -1;
            }
            count+=a/k;
        }
        return count;
    }
}


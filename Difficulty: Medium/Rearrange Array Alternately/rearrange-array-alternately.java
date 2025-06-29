class Solution {
    public static void rearrange(int arr[]) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i+=2){
            int j=n-1;
            while(j>i){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}

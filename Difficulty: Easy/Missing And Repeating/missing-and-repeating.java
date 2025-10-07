

// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        int[] freq=new int[n+1];
        for(int i=0; i<n; i++){
            freq[arr[i]]++;
        }
        int rep=-1;
        int miss=-1;
        for(int i=1; i<=n; i++){
            if(freq[i]==2){
                rep=i;
            }
            else if(freq[i]==0){
                miss=i;
            }
        }
        result.add(rep);
        result.add(miss);
        return result;
        // code here
    }
}

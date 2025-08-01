



// User function Template for Java


class Solution {
    static int majorityElement(int arr[]) {
        if(arr.length==1)
        return arr[0]; //base case
        
        
        int size=arr.length/2;
        int count=1;
        
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
            count++;
                if(count>size)
                return arr[i];
            }
            else
            count=1;
        }
        return -1;
    }
}




class Solution {
   static int minJumps(int[] arr) {
        // code here
        int startIdx=0;
        int endIdx=arr.length-1;
        int maxIdx=0;
        int maxSum=0;
        int minJumps=0;
        while(startIdx<=endIdx){
            int left=startIdx+1;
            int right=startIdx+arr[startIdx];
            if(right>=endIdx)
            return minJumps+1;
            maxSum=0;
            for(int i=left;i<=right;i++){
                int currSum=i+arr[i];
                if(currSum>maxSum){
                    maxIdx=i;
                    maxSum=currSum;
                }
            }
            // System.out.println(maxIdx);
            if(arr[maxIdx]==0) return -1;
            startIdx=maxIdx;
            minJumps++;
        }
        
        return minJumps;
    }


}
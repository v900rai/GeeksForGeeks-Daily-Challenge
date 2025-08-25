// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        
        int min1=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++ ){
                sum=sum+arr[j];
                if(sum>x){
                    int k=j-i;
                    if(k<min1){
                        min1=k;
                    }
                    break;
                }
            }
        }
           if(min1==Integer.MAX_VALUE)
        {
            return 0;
        }
     int hy=min1+1;
     return hy;
    }
}

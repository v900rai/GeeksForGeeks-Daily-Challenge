
class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
        int[]prevsmaller=previous(arr);
        int[]nextsmaller=next(arr);
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,((nextsmaller[i]-prevsmaller[i]-1)*arr[i]));
        }
        return ans;
    }
    public static int[] previous(int[]arr){
        int[]prev=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                prev[i]=-1;
            }else{
                prev[i]=st.peek();
            }
            st.push(i);
        }
        return prev;
    }
    public static int[] next(int[] arr){
       int[]next=new int[arr.length];
       Stack<Integer>st=new Stack<>();
       for(int i=arr.length-1;i>=0;i--){
           while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
               st.pop();
           }
           if(st.isEmpty()){
               next[i]=arr.length;
           }else{
               next[i]=st.peek();
           }
           st.push(i);
       }
       return next;
        
    }
}


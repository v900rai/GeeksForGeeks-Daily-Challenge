
class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
         Set<Integer> set= new HashSet<>();
         
         int sum=arr[0];
         set.add(sum);
         if(sum==0) return true;
         
         for(int i=1; i<arr.length; i++){
             
             if(arr[i]==0) 
             return true;
             
             sum+=arr[i];
             
             if(set.contains(sum) || set.contains(0)) 
             return true;
             else set.add(sum);
         }
         
         return false;
    }
}
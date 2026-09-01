class Solution {
    public static int largest(int[] arr) {
        

       
       int max  = 0;
       for(int num : arr){
           if(num> max){
               max = num;
           }
       }
       return max;
        
    }
}

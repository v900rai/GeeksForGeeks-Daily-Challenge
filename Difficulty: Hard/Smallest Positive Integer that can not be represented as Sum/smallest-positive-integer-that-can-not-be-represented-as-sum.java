class Solution {
    long smallestpositive(long[] array, int n){ 
        // Your code goes here 
        Arrays.sort(array);
        long sum=array[0];
        if(sum>1){
            return 1;
        }
        for(int i=1;i<array.length;i++){
            if(array[i]-sum>1){
                return sum+1;
            }
            sum+=array[i];
        }
      
        return sum+1;

}


}
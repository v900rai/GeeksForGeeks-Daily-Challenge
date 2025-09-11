class Solution {
    long smallestpositive(long[] array, int n){ 
        Arrays.sort(array); // step 1: array को sort कर लो
        
        long sum = array[0]; // पहले element से शुरुआत
        
        // अगर smallest element ही 1 से बड़ा है,
        // तो हम 1 represent नहीं कर सकते
        if(sum > 1){
            return 1;
        }

        // अब array को traverse करो
        for(int i = 1; i < array.length; i++){
            // अगर अगला element और current sum के बीच gap > 1 है,
            // तो sum+1 represent नहीं हो सकता
            if(array[i] - sum > 1){
                return sum + 1;
            }
            // otherwise, इस element को sum में जोड़ दो
            sum += array[i];
        }
      
        // अगर पूरा array check कर लिया, तो next possible missing number होगा sum+1
        return sum + 1;
    }
}

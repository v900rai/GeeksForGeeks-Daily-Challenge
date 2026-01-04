import java.util.*;  

class Solution {
    static int majorityElement(int arr[]) {
         if(arr.length == 1){
             return arr[0];
         }
         int size = arr.length/2;
         int count = 1;
         Arrays.sort(arr);
        // sorted array को iterate करके frequency count करेंगे
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) { // अगर current element previous के बराबर है
                count++;  // frequency बढ़ाओ
                if(count > size)  // अगर frequency n/2 से ज्यादा हो गई
                    return arr[i]; // यही majority element है
            } else {
                // element change हो गया तो count reset कर दो
                count = 1;
            }
        }
       
        
        // अगर कोई majority element exist नहीं करता
        return -1;
    }
}

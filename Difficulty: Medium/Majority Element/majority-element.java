import java.util.*;  

class Solution {
    static int majorityElement(int arr[]) {
        
        // अगर array में सिर्फ एक element है तो वही majority element होगा
        if(arr.length == 1)
            return arr[0]; // base case
        
        int size = arr.length / 2; // majority element होने के लिए count > n/2 होना चाहिए
        int count = 1; // लगातार आने वाले elements को count करेंगे
        
        // Array को sort कर दिया, ताकि एक जैसे elements साथ आ जाएं
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

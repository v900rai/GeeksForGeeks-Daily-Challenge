//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
          // code here
        int freqA[] = new int[26];
        int freqB[] = new int[26];
        
        for(char ch : A.toCharArray()) {
            freqA[ch - 'a']++;
        }
        
        for(char ch : B.toCharArray()) {
            freqB[ch - 'a']++;
        }
        
        StringBuilder uncommon = new StringBuilder();
        
        for(int i=0; i<26; i++) {
            if((freqA[i]>0 && freqB[i]==0) || (freqA[i]==0 && freqB[i]>0)) {
                uncommon.append((char) (i+'a'));
            }
        }
        if(uncommon.length() == 0) {
            return "-1";
        } 
        
        return uncommon.toString();
    }
}


    

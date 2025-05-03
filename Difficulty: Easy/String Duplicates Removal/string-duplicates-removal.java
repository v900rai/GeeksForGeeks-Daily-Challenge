//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDuplicates(String s) 
    {
        Set<Character> st=new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            st.add(ch);
        }
        String rem = "";
        for(Character ch : st) {
            rem += ch;
        }
        return rem;
    }
}

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution obj = new Solution();

            boolean a = obj.areIsomorphic(s1, s2);
            if (a)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1, String s2) {
          
        if(s1.length()!=s2.length())
        {
            return false;
        }
        
        int ts[]=new int[256];
        int st[]=new int[256];
        
        Arrays.fill(ts,-1);
        Arrays.fill(st,-1);
        
        for(int i=0;i<s1.length();i++)
        {
            char ss=s1.charAt(i);
            char tt=s2.charAt(i);

            if(ts[ss]==-1 && st[tt]==-1)
            {
                ts[ss]=tt;
                st[tt]=ss;
            }
            
            else if(ts[ss]!=tt || st[tt]!=ss)
            {
                return false;
            }
        }
        
return true;
    
    }
}
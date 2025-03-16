//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int n = sc.nextInt();

    		System.out.println (new Sol().getCount (s, n)); 
        
System.out.println("~");
}
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int getCount (String S, int N)
    {
        // your code here
        int cnt=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        char prev= S.charAt(0);
        hm.put(prev,1);
        for (int i=1;i<S.length();i++) {
            char curr=S.charAt(i);
            if (curr!=prev) {
                hm.put(curr,hm.getOrDefault(curr,0) + 1);
                prev=curr; 
            }
        }
        for(Character x:hm.keySet()){
            if(hm.get(x)==N){
                cnt++;
            }
        }
        return cnt;
    }
}


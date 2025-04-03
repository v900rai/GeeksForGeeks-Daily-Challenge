//{ Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.areAnagram(S1, S2));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function template for Java
class Solution {
    static int areAnagram(String s1, String s2) {
      char ch[]= s1.toCharArray();
      char ch1[]=s2.toCharArray();
      Arrays.sort(ch);
      Arrays.sort(ch1);
      if(Arrays.equals(ch,ch1)){
          return 1;
      }
      else
      return 0;
    }
}
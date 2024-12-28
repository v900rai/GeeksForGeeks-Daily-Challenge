//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String s = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.sort(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String sort(String s) 
    {
        
        char a[]=new char[s.length()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.charAt(i);
        }
        Arrays.sort(a);
        String res="";
        for(int i=0;i<a.length;i++)
        {
            res+=a[i];
        }
        return res;
    }
} 
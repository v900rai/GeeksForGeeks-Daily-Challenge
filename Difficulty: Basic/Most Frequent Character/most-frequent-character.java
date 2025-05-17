//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String line = br.readLine().trim();

            Solution obj = new Solution();

            System.out.println(obj.getMaxOccuringChar(line));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends





class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
       
        Map<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<line.length();i++){
            map.put(line.charAt(i),map.getOrDefault(line.charAt(i),0)+1);
        }
        int max=0;
        char c='a';
        for(Map.Entry<Character,Integer>en:map.entrySet()){
            if(en.getValue()>max){
            c=en.getKey();
            max=en.getValue();
            }
        }
        return c;
    
    
}
}
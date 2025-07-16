// User function Template for Java

class Solution 
{ 
    String removeReverse(String S) 
    { 
        // code here
        HashMap<Character, Integer> freq = new HashMap<>();
        int n = S.length();
        for(int i=0;i<n;i++) {
            freq.put(S.charAt(i), freq.getOrDefault(S.charAt(i), 0)+1);
        }
        boolean[] unvisited = new boolean[n];
        Arrays.fill(unvisited, true);
        boolean moveForward = true;
        int i=0, j=n-1;
        while(i<=j) {
            if(moveForward) {
            if(freq.get(S.charAt(i))>1) {
                unvisited[i]=false;
                int count = freq.get(S.charAt(i));
                freq.put(S.charAt(i), count-1);
                moveForward=!moveForward;
            }
            i++;
            }
            else {
                if(freq.get(S.charAt(j))>1) {
                unvisited[j]=false;
                int count = freq.get(S.charAt(j));
                freq.put(S.charAt(j), count-1);
                moveForward=!moveForward;
            }
            j--;
            }
        }
        StringBuilder ans = new StringBuilder();
        if(moveForward) {
            for(int k=0;k<n;k++) {
                if(unvisited[k]) ans.append(S.charAt(k));
            }
        }
        else {
            for(i=n-1;i>=0;i--) {
                if(unvisited[i]) ans.append(S.charAt(i));
            }
        }
        return ans.toString();
    }
} 
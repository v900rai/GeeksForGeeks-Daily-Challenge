//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // Number of test cases
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] mat = new char[n][m];

            // Reading the matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = sc.next().charAt(0);
                }
            }

            String word = sc.next();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(mat, word);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                boolean[][] visit = new boolean[mat.length][mat[0].length];
                if(check(mat, i, j, 0, word, visit)){
                    return true;
                }
            }
        }
        return false;
    }
    
    static boolean check(char[][] mat, int i, int j, int idx, String word, boolean[][] visit){
        if(idx == word.length()){
            return true;
        }
        
        if(i < 0 || i >= mat.length || j < 0 || j >= mat[0].length || visit[i][j] 
        || mat[i][j] != word.charAt(idx)){
            return false;
        }
        
        visit[i][j] = true;
        if(check(mat, i, j-1, idx+1, word, visit) ||
           check(mat, i, j+1, idx+1, word, visit) ||
           check(mat, i-1, j, idx+1, word, visit) ||
           check(mat, i+1, j, idx+1, word, visit) ){
               return true;
           }
           
           visit[i][j] = false;
           return false;
           
    }
}
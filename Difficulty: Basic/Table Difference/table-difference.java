import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s =new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int diff=n1-n2;
        for(int i=1;i<=10;i++){
            System.out.print(diff*i+" ");
        }
    }
}
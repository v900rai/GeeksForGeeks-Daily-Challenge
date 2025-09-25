import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, res = 0;
        if(n == 0){
            System.out.println("0");
            
        }
        if(n == 1){
            System.out.println("1");
        }
        else{
            for(int i = 2; i <= n; i ++){
                res = a + b;
                a = b;
                b = res;
            }
            System.out.println(res);
        }
    }
}
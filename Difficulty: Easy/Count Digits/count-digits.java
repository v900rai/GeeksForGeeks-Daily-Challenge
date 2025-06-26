//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
         Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); // input taken
        int count =0;  //count using count variable
        while(num != 0){ // that loop is implement for count digit
            int rem = num % 10;
            num /= 10;
            count++;
        }
        System.out.println(count); //print count
    }
}
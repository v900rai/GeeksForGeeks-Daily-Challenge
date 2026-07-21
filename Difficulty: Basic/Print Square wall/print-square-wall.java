import java.util.Scanner;

class GFG {
    public static void main(String args[]) {
        // code here
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i =1; 
        while(i<=n){
            System.out.println("* ".repeat(n));
            i++;
        }
    }
}
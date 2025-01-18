//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
/*Complete the function(s) below*/
class Solution {
    public boolean searchEle(List<Integer> arr, int x) {
       for(Integer n:arr){
           if(n==x){
               return true;
           }
       }
       return false;
    }

    public void insertEle(List<Integer> arr, int y, int yi) {
          arr.add(y);
        int n = arr.size()-1;
        while(n>0&&yi<n){
            int temp = arr.get(n);
            arr.set(n, arr.get(n-1));
            arr.set(n-1, temp);
            n--;
        }
        
    }

    public void deleteEle(List<Integer> arr, int z) {
             int j = -1;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)==z){
                j = i;
                break;
            }
        }
        if(j>=0){
            for(int i=j; i<arr.size()-1; i++){
                arr.set(i, arr.get(i+1));
            }
            arr.remove(arr.size()-1);
        }
        // add code here.
    }
}

//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {
            String[] arrInput = scanner.nextLine().split(" ");
            List<Integer> arr = new ArrayList<>();
            for (String s : arrInput) {
                arr.add(Integer.parseInt(s));
            }
            List<Integer> temp = new ArrayList<>(arr);

            String[] inputs = scanner.nextLine().split(" ");
            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);
            int yi = Integer.parseInt(inputs[2]);
            int z = Integer.parseInt(inputs[3]);

            Solution obj = new Solution();
            boolean b = obj.searchEle(arr, x);
            System.out.print(b ? "true " : "false ");

            obj.insertEle(arr, y, yi);
            temp.add(yi, y);
            System.out.print(arr.equals(temp) ? "true " : "false ");
            temp.remove((Integer)z);
            obj.deleteEle(arr, z);
            System.out.println(arr.equals(temp) ? "true " : "false ");

            System.out.println("~");
        }

        scanner.close();
    }
}
// } Driver Code Ends


// // User function Template for Java

// class Solution {
//     // Function to find the days of buying and selling stock for max profit.
//     int stockBuySell(int arr[]) {
//         int profit=0;
//         int n=arr.length;
//         for(int i=0; i<n-1; i++){
//             if(arr[i+1]>arr[i]){
//                 profit+=arr[i+1]-arr[i];
//             }
//         }
//         return profit;
//     }
// }

class Solution  {
    int stockBuySell(int arr[]){
        int profit =0;
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i+1]>arr[i]){
                profit =profit+arr[i+1]-arr[i];
            }
        }
        return profit;
    }
}





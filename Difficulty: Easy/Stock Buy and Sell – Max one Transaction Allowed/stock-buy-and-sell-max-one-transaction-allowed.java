class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        
 


// User function Template for Java


        // If prices array is empty or has only one element, profit is 0
        
        if(prices == null || prices.length<2){
            return 0;
        }

        int minPrice = Integer.MAX_VALUE; // Keeps track of the minimum price seen so far
        int maxProfit = 0; // Keeps track of the maximum profit possible

        for (int price : prices) {
            // Update the minimum price
            if (price < minPrice) {
                minPrice = price;
            } 
            // Calculate the profit and update maxProfit if it's higher
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
}
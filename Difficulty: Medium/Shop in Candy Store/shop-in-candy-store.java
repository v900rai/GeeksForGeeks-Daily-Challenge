class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(prices);
        
        int minCost=0;
        int maxCost=0;
        
        int i=0;
        int j=prices.length;
        
        outerloop:
        while(i<j)
        {
            minCost+=prices[i];
            i++;
            
            j-=k;
            if(j<i)break outerloop;
            
        }
        
        i=-1;
        j=prices.length-1;
        
        outerloop:
        while(i<j)
        {
            maxCost+=prices[j];
            j--;
            
            i+=k;
            if(i>j)break outerloop;
            
        }
        
        
        list.add(minCost);
        list.add(maxCost);
        return list;
        
    }
}

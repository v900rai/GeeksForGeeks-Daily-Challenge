class Solution {

    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
     
        ArrayList<Integer> list = new ArrayList<>();

        // If n == 0 → empty row
        if(n==0) 
            return new ArrayList<Integer>();
        
        // Row 1 of Pascal Triangle → [1]
        list.add(1);
        if(n==1) { 
            return list; 
        }
        
        // Row 2 of Pascal Triangle → [1, 1]
        list.add(1);
        if(n==2) 
            return list;
       
        // Build rows from 3rd row to nth row
        for(int k=2; k<n; k++){
            
            ArrayList<Integer> mainList = new ArrayList<>();
            
            // Every row starts with 1
            mainList.add(1);

            // Middle values: sum of two numbers from previous row
            for(int i=1; i<list.size(); i++){
                mainList.add(list.get(i) + list.get(i-1));
            }

            // Every row ends with 1
            mainList.add(1);

            // Update list to the new row
            list = mainList;
        }

        return list;   
    }
}

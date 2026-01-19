

class Solution {
    public boolean canSplit(int arr[]) {
        int total = 0;
        for(int i=0;i<arr.length;i++){
            
            //arr ka sum nikal diya full
            total += arr[i];
        }
        //ab cheak krna h ki sum k equal h ki nii 
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if((total - sum) == sum) 
            return true;
        }
        return false;
       
        
    }
}
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Edge case: agar array empty ho
       
        if(arr  == null || arr.length==0){
            return result;
        }
        
        // Initial min and max ko first element se set karte hain
        int min = arr[0];
        int max = arr[0];
        
        // Array traverse karke min aur max nikalenge
        
      
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        // result list me min aur max add karte hain
        result.add(min);
        result.add(max);
        
        return result;
    }
}

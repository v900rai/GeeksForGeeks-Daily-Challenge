class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        int n = arr.length-1;
        Vector<Integer> v = new Vector<> ();
        
        while(n>=0 && arr[n] == 9) {
            arr[n--] = 0;
        }
        

        // Case when all elements are 9
        if(n<0) {
            v.add(1);
        } else{        // Case when all elements are not 9 and we need to increase last non zero element
            arr[n] = arr[n]+1;
        }
        
        for(int i = 0;i<arr.length;i++){
                v.add(arr[i]);
            }
        
        return v;
    }
}
class Solution {
    public int[] getThreeLargest(int arr[]) {
       
        // Arrays.sort(arr);
        int size = arr.length;
        int []newArr;
        int firstKey = 0;
        int secondKey = 0;
        int thirdKey = 0;
        
        for(int elem : arr) {
            if(elem > firstKey) {
                firstKey = elem;
            }
        }
        
        for(int i=0; i<size; i++) {
            if(arr[i] > secondKey && arr[i] != firstKey) {
                secondKey = arr[i];
            }
        }
        
        for(int i=0; i<size; i++) {
            if(arr[i] > thirdKey && arr[i] != firstKey && arr[i] != secondKey) {
                thirdKey = arr[i];
            } 
        }
        
        
       if(thirdKey != 0) {
           newArr = new int[3];
           newArr[0] = firstKey;
           newArr[1] = secondKey;
           newArr[2] = thirdKey;
           
       } else if(secondKey != 0) {
           newArr = new int[2];
            newArr[0] = firstKey;
            newArr[1] = secondKey;
      } else {
          newArr = new int[1];
          newArr[0] = firstKey;
      }
        
        
        return newArr;
    }
}


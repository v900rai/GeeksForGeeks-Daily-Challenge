// User function Template for Java

class Complete {

   public static int[] Smallestonleft(int arr[], int n) {
         int[] res = new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        
       
        res[0] = -1;
        set.add(arr[0]);
        
        for (int i = 1; i < n; i++) {
           
            Integer smaller = set.lower(arr[i]);
            res[i] = (smaller != null) ? smaller : -1;
            set.add(arr[i]);
        }
        
        return res;
    }


}

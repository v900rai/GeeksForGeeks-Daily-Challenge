class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
       ArrayList<Integer>ans = new ArrayList<>();
        int sum = 0;
        int max = 0;
       for(int i =0;i<n;i++){
           sum += a[i][i];
       }
        for(int num : b){
            max = Math.max(num,max);
        }
        ans.add(sum);
        ans.add(max);
        return ans;

        
        
    }
}

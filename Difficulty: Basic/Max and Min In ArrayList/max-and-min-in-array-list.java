class Solution {
    public static int maximumElement(ArrayList<Integer> arr) {
        // Your code here
        int max=0;
        for(Integer a:arr)
        {
            if(a>max)
            {
                max=a;
            }
        }
        return max;
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        
        // Your code here
        int min=Collections.max(arr);
        for(Integer a:arr)
        {
            if(a<min)
            {
                min=a;
            }
        }
        return min;
    }
}
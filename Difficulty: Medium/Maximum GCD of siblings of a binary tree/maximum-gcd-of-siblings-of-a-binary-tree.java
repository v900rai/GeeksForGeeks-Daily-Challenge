// User function Template for Java

class Solution {
    static int maxBinTreeGCD(ArrayList<ArrayList<Integer>> arr, int N) {
        // code here
        int maxgcd=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int size=arr.size();
        for(int i=0;i<size;i++){
            int val1=arr.get(i).get(0);
            int val2=arr.get(i).get(1);
            if(map.containsKey(val1)){
                int gcd=calculateGCD(map.get(val1),val2);
                if(gcd>maxgcd){
                    maxgcd=gcd;
                }
            }else{
                map.put(val1,val2);
            }
        }
        return maxgcd;
    }
    public static int calculateGCD(int a, int b) {
        // Keep calculating remainder until it becomes zero
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        // When remainder becomes zero, the divisor is the GCD
        return a;
    }
};


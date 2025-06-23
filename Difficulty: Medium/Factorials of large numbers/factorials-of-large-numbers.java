// User function Template for Java

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        while(n>1){
            int carry = 0;
            for(int i=res.size()-1;i>=0;i--){
                int mult = res.get(i)*n + carry;
                carry = mult/10;
                res.set(i,mult%10);
            }
            while(carry>0){
                res.add(0,carry%10);
                carry = carry/10;
            }
            n--;
        }
        return res;
    }
}


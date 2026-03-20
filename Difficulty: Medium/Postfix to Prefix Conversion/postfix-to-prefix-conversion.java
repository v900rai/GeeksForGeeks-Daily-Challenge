class Solution {
    static String postToPre(String post_exp) {
        // code here
        char arr[]=post_exp.toCharArray();
        Stack<String>res=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(Character.isLetterOrDigit(arr[i]))
            res.push(String.valueOf(arr[i]));
            else
            {
                String op1=res.pop();
                String op2=res.pop();
                res.push(arr[i]+op2+op1);
            }
        }
        return res.peek();
    }
}
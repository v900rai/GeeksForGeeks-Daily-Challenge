





// User function Template for Java
class Solution {
    public static String reverseString(String s) {
        char [] chars=s.toCharArray();
        int left =0;
        int right =chars.length-1;

        // दो pointers से characters को swap करते हुए reverse किया
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        // final reversed string को return किया
        return new String(chars);
    }
}

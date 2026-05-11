import java.util.*;

class Solution {

    static boolean palindromePair(String[] arr) {

        int n = arr.length;

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        for(int i = 0; i < n; i++) {

            String word = arr[i];
            int len = word.length();

            for(int j = 0; j <= len; j++) {

                String left = word.substring(0, j);
                String right = word.substring(j);

                // Case 1
                if(isPalindrome(left)) {

                    String rev = new StringBuilder(right).reverse().toString();

                    if(map.containsKey(rev) && map.get(rev) != i)
                        return true;
                }

                // Case 2
                if(j != len && isPalindrome(right)) {

                    String rev = new StringBuilder(left).reverse().toString();

                    if(map.containsKey(rev) && map.get(rev) != i)
                        return true;
                }
            }
        }

        return false;
    }

    static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while(i < j) {

            if(s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}
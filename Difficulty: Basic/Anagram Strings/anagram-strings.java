import java.util.Arrays;

class Solution {
    static int areAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return 0;
        }

        char[] ch = s1.toCharArray();
        char[] ch1 = s2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        if (Arrays.equals(ch, ch1)) {
            return 1;
        }

        return 0;
    }
}
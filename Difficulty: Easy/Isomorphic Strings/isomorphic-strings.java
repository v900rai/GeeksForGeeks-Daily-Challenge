class Solution {
    public boolean areIsomorphic(String s, String t) {

        // Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Two HashMaps for mapping
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        // Traverse both strings
        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // Check s -> t mapping
            if (mapST.containsKey(ch1)) {
                if (mapST.get(ch1) != ch2) {
                    return false;
                }
            } else {
                mapST.put(ch1, ch2);
            }

            // Check t -> s mapping
            if (mapTS.containsKey(ch2)) {
                if (mapTS.get(ch2) != ch1) {
                    return false;
                }
            } else {
                mapTS.put(ch2, ch1);
            }
        }

        return true;
    }

}
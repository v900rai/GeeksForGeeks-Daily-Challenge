class Solution {
    public static String caseSort(String s) {
        // code here
        int n = s.length();
        char[] result = new char[n];
        
        List<Character> upper = new ArrayList<>();
        List<Character> lower = new ArrayList<>();
        
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                upper.add(c);
            }else{
                lower.add(c);
            }
        }
        
        Collections.sort(upper);
        Collections.sort(lower);
        
        int u = 0, l = 0;
        
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                result[i] = upper.get(u++);
            }else{
                result[i] = lower.get(l++);
            }
        }
        
        return new String(result);
    }
}
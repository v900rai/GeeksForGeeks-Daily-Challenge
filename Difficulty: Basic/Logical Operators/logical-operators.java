class Solution {
    public String booleanOperations(boolean a, boolean b) {
        // Code here
          boolean and_result = a&&b;
        boolean or_result = a||b;
        boolean not_result = !a;
        
        return and_result+ " " + or_result+ " " + not_result;
    }
}
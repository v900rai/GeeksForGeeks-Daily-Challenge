class Solution {
    public String countAndSay(int n) {
        // code here
        StringBuilder sb = new StringBuilder("1");
        for(int s=1; s<n; s++){
            int i=0, j=0;
            StringBuilder temp = new StringBuilder("");
            while(j < sb.length()){
                if(sb.charAt(i) != sb.charAt(j)){
                    temp.append(j-i);
                    temp.append(sb.charAt(i));
                    i = j;
                }
                j++;
            }
            temp.append(j-i);
            temp.append(sb.charAt(i));
            sb = temp;
        }
        return sb.toString();
    }
}
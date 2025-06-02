// User function Template for Java
class Solution {
     public String longestCommonPrefix(String arr[]) {
        // code here
        
        if(arr.length==1){
            return arr[0];
        }
        String prefix=arr[0];
        String newPrefix="";
        
        for(int i=1;i<arr.length;i++){
            String s=arr[i];
            newPrefix=getNewPrefix(prefix,s);
            if(newPrefix.equals("")){
                
                 return newPrefix;
            }
                
        }
        return newPrefix;
    }
    
    public String getNewPrefix(String prefix,String s){
        char[] ch1=prefix.toCharArray();
        char[] ch2=s.toCharArray();
        StringBuffer sb=new StringBuffer();
        
        for(int i=0;i<ch1.length;i++){
            if((i<ch1.length && i<ch2.length) && (ch1[i]==ch2[i])){
                sb.append(ch1[i]);
            }else{
                return new String(sb);
            }
        }
        
        return new String(sb);
    }


}
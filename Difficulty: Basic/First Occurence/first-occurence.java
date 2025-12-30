



class Solution {
    // Function to locate the occurrence of the string x in the string s.
    int firstOccurence(String txt, String pat) {
       
       int n1 = txt.length();
       int n2 = pat.length();
       
      for(int i=0;i<=n1-n2;i++){
          int j;
          for( j=0;j<n2;j++){
              if(txt.charAt(i+j)!=pat.charAt(j)){
              break;
              
          }
      }
      if(j==n2){
          return i;
      }  
      }
      return -1;
}
}// time complexity is 0.29


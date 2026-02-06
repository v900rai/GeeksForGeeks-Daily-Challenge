class Solution {
    String reverseWithSpacesIntact(String s) {
        char[] arr=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j) {
            if(arr[i]==' ')
                i++;
            else if(arr[j]==' ')    
                j--;
            else {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return String.valueOf(arr);
    }
}
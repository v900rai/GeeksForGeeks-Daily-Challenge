// User function Template for Java

class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        ArrayList<Integer> pre=new ArrayList<>();
        
        for(int i=0;i<a.length;i++){
            int co=0;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    co++;
                    break;
                }
            }
            if(co==0){
                    pre.add(a[i]);
                }
            }
        return pre;
            }
    }

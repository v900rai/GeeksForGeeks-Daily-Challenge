class Solution {

    ArrayList<Integer> intersection(int[] a, int[] b) {

        int i=0,j=0;

        ArrayList<Integer>ans=new ArrayList<>();

        while(i<a.length&&j<b.length){

            if(i>0&&a[i-1]==a[i]){

                i++;

                continue;

            }

            if(a[i]<b[j]){

                i++;

            }else if(a[i]>b[j]){

                j++;

            }else{

                ans.add(a[i]);

                i++;

                j++;

            }

        }

       return ans;

    }

}
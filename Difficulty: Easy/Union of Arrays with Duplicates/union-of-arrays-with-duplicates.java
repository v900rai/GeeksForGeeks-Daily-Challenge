

// User function Template for Java



class Solution {
    public static int findUnion(int a[], int b[]) {
        HashSet<Integer> unionSet = new HashSet<>();
        for (int i=0; i<a.length; i++) {
            unionSet.add(a[i]);
        }
        
        for(int j=0; j<b.length; j++){
            unionSet.add(b[j]);
        }
        
        return unionSet.size();
    }

    /*public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};
        
        System.out.println("Size of Union: " + findUnion(a, b)); // Output: 6
    }*/
}

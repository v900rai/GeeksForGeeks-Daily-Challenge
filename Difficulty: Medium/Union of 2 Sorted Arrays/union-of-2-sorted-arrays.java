

//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
 public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        Set<Integer>set=new TreeSet<>();
        for (int i:a)set.add(i);
        for (int i:b)set.add(i);
        return new ArrayList<>(set);
    }
}




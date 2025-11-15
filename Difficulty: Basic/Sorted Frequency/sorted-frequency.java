//Back-end complete function Template for Java
class Solution {
    public static void freqSorted(int arr[]) {
        // Your Code Here
        Arrays.sort(arr);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(HashMap.Entry<Integer,Integer> a:hm.entrySet())
        {
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }
}



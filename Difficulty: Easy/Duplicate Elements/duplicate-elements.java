/* Helper class containing function SortedDuplicates
containg arguments
arr[]: the duplicated array
n: size of the array
*/


class Geeks
{
    // print the elements which appear more than
    // once in the array in sorted order
    public static void SortedDuplicates(int arr[], int n)
    {
        //Your code here
        HashSet<Integer>li1=new HashSet<>();
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!set.add(arr[i])) li1.add(arr[i]);
        }
        ArrayList<Integer>li=new ArrayList<>(li1);
        Collections.sort(li);
        if(li.size()==0){
            System.out.print("-1");
            return;
        }
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i)+" ");
        }
     }
    
}
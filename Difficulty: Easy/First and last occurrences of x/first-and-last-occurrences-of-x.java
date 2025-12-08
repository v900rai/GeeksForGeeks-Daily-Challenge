class Solution 
{
    public ArrayList<Integer> firstAndLast(int x, int arr[])
    {
        ArrayList<Integer> result=new ArrayList<>();
        int n=arr.length;
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                found=true;
                break;
            }
        }
        if(found==true)
        {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                result.add(i);
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==x)
            {
                result.add(i);
                break;
            }
        }
        }
        else
        {
            result.add(-1);
        }
        return result;
    }
}
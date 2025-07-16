// User function Template for Java

class Solution {
  static int countTriplets(Node head, int x) {
      ArrayList<Integer> ans =new ArrayList<Integer>();
      while(head!=null)
      {
        ans.add(head.data);
        head=head.next;
      }
      int count=0;
      for(int i=0;i<ans.size();i++)
      {
        int curr=ans.get(i);
        int low=i+1;
        int high=ans.size()-1;
        while(low<high)
        {
            int sum=curr+ans.get(low)+ans.get(high);
            if(sum>x)
            {
                low++;
            }
            else if(sum<x)
            {
                high--;
            }
            else
            {
                count++;
                low++;
                high--;
            }
        }
          
      }
      return count; 
        
    }
}


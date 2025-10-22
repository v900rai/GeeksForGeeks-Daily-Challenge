class Solution {
    
    public ArrayList<String> findPermutation(String s) {
        ArrayList<String> ans=new ArrayList<>();
        char arr[]=s.toCharArray();
        int index=0;
        solve(arr,index,ans);
        Collections.sort(ans);
        return ans;
    }
    
    public void solve(char arr[],int index,ArrayList<String> ans){
        
        // base class
        if(index>=arr.length){
            ans.add(new String(arr));
            return;
        }
        
        HashSet<Character> used=new HashSet<>();
        for(int j=index;j<arr.length;j++){
            if(used.contains(arr[j])) continue;
            used.add(arr[j]);
            swap(arr,index,j);
            solve(arr,index+1,ans);
            
            // backtrack
            swap(arr,index,j);
        }
    }
    
    public void swap(char arr[],int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
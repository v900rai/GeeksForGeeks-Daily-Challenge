class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int sumeven=0;
        int sumodd=0;
        for(int i=1;i<=N;i++){
        if(i%2==0){
            sumeven +=i;
        }
        else{
            sumodd +=i;
        } 
      }
        result.add(sumeven);
        result.add(sumodd);
        
        return result;
     }
}


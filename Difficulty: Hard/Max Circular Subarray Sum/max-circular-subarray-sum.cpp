class Solution {
    private:
    int kadansAlgorith(vector<int> &arr){
        int sum=0;
        int maxi= INT_MIN;
        for (int i=0; i< arr.size(); i++){
            sum= sum+ arr[i];
            maxi= max(sum, maxi);
            if(sum<0){
                sum=0;
            }
            
        }
        return maxi;
    }
    int findTotalElement(vector<int> &arr){
        int sum= 0;
        for (int i=0;  i< arr.size(); i++){
            sum= sum+ arr[i];
        }
        return sum;
    }
    protected:
    int MinSumArray(vector<int> &arr){
        int sum= 0;
        int mini= INT_MAX;
        for (int i=0; i< arr.size(); i++){
            sum= sum+ arr[i];
            mini= min(mini, sum);
            if(sum>0){
                sum= 0;
            }
        }
        return mini;
    }
    
  public:
    int maxCircularSum(vector<int> &arr) {
        // code here
        int maxKadansAlgoritm= kadansAlgorith(arr);
        int miniKAdnansAlgorithm= MinSumArray(arr);
        int totalElement= findTotalElement(arr);
        if(maxKadansAlgoritm<0){
            return maxKadansAlgoritm;
        }
        return max(maxKadansAlgoritm, totalElement- miniKAdnansAlgorithm);
        // int ans=  max(maxKadansAlgoritm, totalElement- miniKAdnansAlgorithm);
    //   if(ans<=0){
    //       return -1;
    //   }
    //   return ans;
        
    }
};
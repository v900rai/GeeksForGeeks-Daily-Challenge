//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
vector<int> modifyAndRearrangeArray(vector<int> &arr) {
        int n = arr.size();
        vector<int>ans(n);
        int left = 0 , right = n-1;
        
        for(int i=0 ; i<arr.size() ; i++){
            if(arr[i] != 0 && i+1<n && arr[i] == arr[i+1]){
                ans[left++] = 2*arr[i];
                arr[i+1] = 0;
            }
            else if(arr[i] == 0){
                ans[right--] = 0;
            }
            else{
                ans[left++] = arr[i];
            }
        }
        return ans;
    }

 
    
};


//{ Driver Code Starts.

int main() {
    string ts;
    getline(cin, ts);
    int t = stoi(ts);
    while (t--) {
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        Solution obj;
        vector<int> ans = obj.modifyAndRearrangeArray(arr);
        for (int i = 0; i < ans.size(); i++) {
            cout << ans[i] << " ";
        }
        cout << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends
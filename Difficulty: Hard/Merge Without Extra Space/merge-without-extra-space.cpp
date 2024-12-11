//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends


class Solution {
  public:
    void merge(vector<int>&arr,int start,int mid,int end){
        int totalLen = end-start+1;
        
        int gap = totalLen/2 + totalLen%2;
        while(gap > 0){
            int i=start;
            int j=start+gap;
            
            while(j<=end){
                if(arr[i] > arr[j]) swap(arr[i],arr[j]);
                
                i++;
                j++;
            }
            gap = gap<=1 ? 0 : (gap/2)+(gap%2);
        }
    }
    void mergeSort(vector<int>&arr,int start, int end){
        if(start >= end) return;
        
        int mid = start + (end - start)/2;
        
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    void mergeArrays(vector<int>& a, vector<int>& b) {
        // code here
        int oldLen = a.size();
        for(int i=0;i<b.size();i++){
            a.push_back(b[i]);
        }
        
        mergeSort(a,0,a.size()-1);
        for(int i=0;i<b.size();i++){
            b[i] = a[oldLen+i];
        }
        for(int i=0;i<b.size();i++){
            a.pop_back();
        }
    }
};
//{ Driver Code Starts.

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t; // Inputting the test cases

    while (t--) {
        vector<int> a, b;

        // Reading the first array as a space-separated line
        string arr1;
        getline(cin >> ws, arr1); // Use ws to ignore any leading whitespace
        stringstream ss1(arr1);
        int num;
        while (ss1 >> num) {
            a.push_back(num);
        }

        // Reading the second array as a space-separated line
        string arr2;
        getline(cin, arr2);
        stringstream ss2(arr2);
        while (ss2 >> num) {
            b.push_back(num);
        }

        Solution ob;
        ob.mergeArrays(a, b);

        // Output the merged result
        for (int i = 0; i < a.size(); i++) {
            cout << a[i] << " ";
        }
        cout << endl;
        for (int i = 0; i < b.size(); i++) {
            cout << b[i] << " ";
        }
        cout << "\n";
    }

    return 0;
}

// } Driver Code Ends
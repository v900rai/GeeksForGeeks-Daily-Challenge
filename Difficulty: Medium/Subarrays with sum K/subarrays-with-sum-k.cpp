//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

#include <vector>
#include <unordered_map>
using namespace std;

class Solution {
public:
    int countSubarrays(vector<int> &nums, int k) {
        unordered_map<int, int> prefixSumFreq; // To store the frequency of prefix sums
        int currentSum = 0; // To keep track of the running prefix sum
        int count = 0;

        prefixSumFreq[0] = 1; // Base case: Subarray starting from index 0

        for (int num : nums) {
            currentSum += num; // Update the running sum
            
            // Check if (currentSum - k) exists in the map
            if (prefixSumFreq.find(currentSum - k) != prefixSumFreq.end()) {
                count += prefixSumFreq[currentSum - k];
            }

            // Update the frequency of the current prefix sum
            prefixSumFreq[currentSum]++;
        }

        return count;
    }
};


//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    cin.ignore();
    while (t--) {

        string ks;
        getline(cin, ks);
        int k = stoi(ks);
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        Solution obj;
        cout << obj.countSubarrays(arr, k);
        cout << endl;
        cout << "~"
             << "\n";
    }

    return 0;
}

// } Driver Code Ends
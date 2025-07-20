class Solution {
  public:
    int countValid(int n, vector<int>& arr) {
        // Mark all allowed digits
        vector<bool> allowed(10, false);
        for (int d : arr) allowed[d] = true;
        
        // Count forbidden (not in arr) digits
        int f = 0, f0 = 0;
        for (int d = 0; d < 10; ++d) {
            if (!allowed[d]) {
                f++;
                if (d != 0) f0++;
            }
        }
        // If all digits are allowed, return all n-digit numbers
        if (f == 0) {
            int total = 1;
            for (int i = 1; i < n; ++i) total *= 10;
            return 9 * total;
        }
        // Total n-digit numbers: 9 * 10^{n-1}
        int total = 1;
        for (int i = 1; i < n; ++i) total *= 10;
        total *= 9;

        // Calculate forbidden_count: f0 * (f)^{n-1}
        int forbidden_count = 0;
        if (f0 > 0) {
            forbidden_count = f0;
            for (int i = 1; i < n; ++i) forbidden_count *= f;
        }
        return total - forbidden_count;
    }
};
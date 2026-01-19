class Solution {
public:
    string removeKdig(string &num, int k) {
        // Stack to maintain a monotonic increasing sequence of digits
        stack<char> stk;
        int removed = 0;

        // Traverse each digit in the number
        for (char digit : num) {
            // Remove larger digits from stack if a smaller digit is found
            while (!stk.empty() && stk.top() > digit && removed < k) {
                stk.pop();
                removed++;
            }

            // Skip leading zeros
            if (stk.empty() && digit == '0') continue;

            stk.push(digit);
        }

        // If removals are still left, remove from the end
        while (!stk.empty() && removed < k) {
            stk.pop();
            removed++;
        }

        // Build the result from the stack
        string result;
        while (!stk.empty()) {
            result.push_back(stk.top());
            stk.pop();
        }

        // Reverse because stack gives digits in reverse order
        reverse(result.begin(), result.end());

        // If result is empty, return "0"
        return result.empty() ? "0" : result;
    }
};
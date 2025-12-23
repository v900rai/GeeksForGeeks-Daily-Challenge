import bisect
class Solution:
    def cntInRange(self, arr, queries):
        arr.sort()
        result = []
        
        for a, b in queries:
            left = bisect.bisect_left(arr, a)
            right = bisect.bisect_right(arr, b)
            result.append(right - left)
            
        return result
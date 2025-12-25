// User function Template for Java

class Solution {
    static int Search(int ar[], int target) {
        int pointOfRot = findPointOfRot(ar, 0, ar.length-1, ar[ar.length-1]);

        int ans = -1;
        if (pointOfRot > 0 && target >= ar[0]) {
            ans = Arrays.binarySearch(ar, 0, pointOfRot, target);
        } else {
            ans = Arrays.binarySearch(ar, pointOfRot, ar.length, target);
        }
        return ans < 0 ? -1 : ans;
    }
    
    static int findPointOfRot(int ar[], int l, int r, int last) {
        int m = l + (r-l)/2;
        if (m-1 >= 0) {
            if (ar[m-1] > ar[m])
                return m;
            else {
                if (ar[m] > last) {
                    return findPointOfRot(ar, m+1, r, ar[r]);
                } else {
                    return findPointOfRot(ar, l, m-1, ar[m-1]);
                }
            }
        }
        return 0;
    }
}
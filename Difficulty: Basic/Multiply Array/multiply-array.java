
class Solution {

    public static int product(int arr[], int n) {
        int sum =1;
        for(int i=0; i<=n-1; i++){
            sum = sum *arr[i];
        }
        return sum;
    }
}

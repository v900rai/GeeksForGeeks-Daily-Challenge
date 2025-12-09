// User function Template for Java

class Solution {
    String secFrequent(String arr[], int N) {
        Arrays.sort(arr);  
        String first = "";
        String second = "";
        int firstCount = 0;
        int secondCount = 0;
        int i = 0;
        while (i < N) {
            String current = arr[i];
            int count = 0;
            while (i < N && arr[i].equals(current)) {
                count++;
                i++;
            }
            if (count > firstCount) {
                secondCount = firstCount;
                second = first;
                firstCount = count;
                first = current;
            } else if (count > secondCount && !current.equals(first)) {
                secondCount = count;
                second = current;
            }
        }
        return second;
    }
}


// User function Template for Java

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> freqA = new HashMap<>();

        for (int num : a) {
            freqA.put(num, freqA.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            if (freqA.containsKey(num) && freqA.get(num) > 0) {
                result.add(num);                     
                freqA.put(num, freqA.get(num) - 1);  
            }
        }

        Collections.sort(result);
        return result;
    }
}


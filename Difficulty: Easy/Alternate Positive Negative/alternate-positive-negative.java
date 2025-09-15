





class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // Separate positive and negative numbers into different lists
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        
        // Traverse the original array and categorize numbers
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }
        
        // Alternately merge positive and negative numbers into the original array
        int posIndex = 0;
        int negIndex = 0;
        int i = 0;
        
        while (posIndex < positive.size() && negIndex < negative.size()) {
            if (i % 2 == 0) {
                arr.set(i++, positive.get(posIndex++));
            } else {
                arr.set(i++, negative.get(negIndex++));
            }
        }
        
        // If there are remaining positive numbers, add them to the array
        while (posIndex < positive.size()) {
            arr.set(i++, positive.get(posIndex++));
        }
        
        // If there are remaining negative numbers, add them to the array
        while (negIndex < negative.size()) {
            arr.set(i++, negative.get(negIndex++));
        }
    }
}

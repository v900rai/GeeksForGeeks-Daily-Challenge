class Solution {
    public int minOperations(int[] arr) {
        // code here
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        double sum = 0.0, target = 0.0;
        int n = arr.length, count = 0;
        
        for(int i = 0; i < n; i++){
            sum += (double)arr[i];
            pq.add((double)arr[i]);
        }
        
        target = sum/2;
        
        while(sum > target && !pq.isEmpty()){
            double el = pq.remove();
            sum -= el;
            sum += (el/2);
            pq.add(el/2);
            count++;
        }
        
        return count;
    }
}
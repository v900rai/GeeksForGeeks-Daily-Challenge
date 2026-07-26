class Solution {
    static double switchCase(int choice, List<Double> arr) {
        switch (choice) {
            case 1:
                // Grab the radius from the first position (index 0)
                double radius = arr.get(0);
                // Formula: pi * r * r
                return Math.PI * radius * radius;
                
            case 2:
                // Grab length from index 0 and breadth from index 1
                double length = arr.get(0);
                double breadth = arr.get(1);
                // Formula: length * breadth
                return length * breadth;
                
            default:
                return 0.0;
        }
    }
}
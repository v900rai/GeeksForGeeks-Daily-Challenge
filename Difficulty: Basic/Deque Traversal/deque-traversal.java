class Solution {
    public static void printDeque(ArrayDeque<Integer> deq) {
        // code here
        while(!deq.isEmpty()){
            System.out.print(deq.pollFirst()+" ");
        }
        System.out.println();
    }
}


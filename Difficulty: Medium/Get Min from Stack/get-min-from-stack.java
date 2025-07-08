
class Solution {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> minStack;    
    
    public Solution() {
            s1 = new Stack<>();
            minStack = new Stack<>();
    }

   
    public void push(int x) {
        s1.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }


    public void pop() {
        if (!s1.isEmpty()) {
            int removed = s1.pop();
            if (removed == minStack.peek()) {
                minStack.pop();
            }
        }
    }

   
    public int peek() {
        if (!s1.isEmpty()) {
            return s1.peek();
        }
        return -1;
    }

  
    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1;
    }
}


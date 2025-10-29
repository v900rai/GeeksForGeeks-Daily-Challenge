// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
       ArrayList<Integer> list=new ArrayList<>();
       int first =-1;
       int second =-1;
       for(int i=0; i<arr.length; i++){
           if(arr[i]==x){
               first = i;
               break;
           }
       }
           for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                second = i;
                break;
            }
        }
       list.add(first);
       list.add(second);
       return list;
        
    }
}



class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        int count=0;
        int clen=arr.size();
        while(clen!=1){
            arr.add(0,arr.get(clen-1));
            clen--;
            count++;
            if(count>clen+1){
                return arr.get(1);
            }else{
            arr.remove(clen+1-count);
            }
        }
        return arr.get(0);
    }
}


class Solution {
    public int findSubarray(int[] arr) {
      Map<Integer,Integer> map = new HashMap<>();
map.put(0,1);
int count = 0;
int sum = 0;
for (int i = 0; i<arr.length; i++){
sum += arr[i];
if(map.containsKey(sum)){
count += map.get(sum);
}
map.put(sum,map.getOrDefault(sum,0) + 1);
}
return count;
    }
}

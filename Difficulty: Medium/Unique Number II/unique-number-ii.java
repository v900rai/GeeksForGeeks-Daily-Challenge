
class Solution {
   public int[] singleNum(int[] arr) {
    // सबसे पहले array की length निकाल ली
    int n = arr.length;
    
    // एक HashMap बनाया जो number की frequency को track करेगा
    Map<Integer, Integer> map = new HashMap<>();
    
    // unique (single frequency वाले) elements को रखने के लिए ArrayList
    ArrayList<Integer> ans = new ArrayList<>();
    
    // हर element की frequency count कर रहे हैं
    for (int num : arr) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    
    // जिन elements की frequency 1 है, उन्हें list में डाल रहे हैं
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 1)
            ans.add(entry.getKey());
    }
    
    // unique elements को ascending order में sort कर रहे हैं
    Collections.sort(ans);
    
    // ArrayList को integer array में convert कर रहे हैं
    int res[] = new int[ans.size()];
    for (int i = 0; i < ans.size(); i++) {
        res[i] = ans.get(i);
    }
    
    // final result return कर रहे हैं
    return res;
}

}




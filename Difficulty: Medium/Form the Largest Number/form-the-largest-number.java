class Solution {
    public String findLargest(int[] arr) {
        // Step 1: Convert int[] to String[]
        String[] strArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }

        // Step 2: Sort using custom comparator
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare combined strings
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Descending order
            }
        });

        // Step 3: Edge case - if largest number is "0", return "0"
        if (strArr[0].equals("0")) {
            return "0";
        }

        // Step 4: Build result
        StringBuilder result = new StringBuilder();
        for (String str : strArr) {
            result.append(str);
        }

        return result.toString();
    }
}

 
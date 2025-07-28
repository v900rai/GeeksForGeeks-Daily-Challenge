class Solution {
    private static int max_element(ArrayList<Integer> arr){
        int n=arr.size();
        int maxi=-1;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr.get(i));
        }
        return maxi;
    }
    public static int balanceSums(int[][] mat) {
        int n=mat.length;int m=mat[0].length;
        ArrayList<Integer> row_max=new ArrayList<>();
        ArrayList<Integer> col_max=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum_row=0;int sum_col=0;
            for(int j=0;j<m;j++){
                sum_row+=mat[i][j];
                sum_col+=mat[j][i];
            }
            row_max.add(sum_row);
            col_max.add(sum_col);
        }
        //System.out.println(row_max+"\n"+col_max);
        int max_row_element=max_element(row_max);
        int op1=0;
        for(int i=0;i<row_max.size();i++){
            op1+=(max_row_element-row_max.get(i));
        }
        int max_col_element=max_element(col_max);
        int op2=0;
        for(int i=0;i<col_max.size();i++){
            op2+=(max_col_element-col_max.get(i));
        }
        return Math.max(op1,op2); 
    }
}
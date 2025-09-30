

//User function Template for Java
class Solution{
    static ArrayList<Integer> getTable(int N){
      ArrayList <Integer> list=new ArrayList();
      for(int i=1; i<=10; i++){
          list.add(N*i);
      }
      return list;
       
        
    }
}
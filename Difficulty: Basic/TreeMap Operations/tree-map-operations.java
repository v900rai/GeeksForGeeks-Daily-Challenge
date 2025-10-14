class GfG
{
 
    void add_Value(TreeMap<Integer,Integer> hm, int x, int y)
    {
 
        hm.put(x,y);
    }
 
    int find_value(TreeMap<Integer, Integer> map, int x)
    {
       
        if(map.containsKey(x))
        {
            return map.get(x);
        }
        
        return -1;
    }
 
    int getSize(TreeMap<Integer, Integer> hm)
    {
         return hm.size();
    }
 
    void removeKey(TreeMap<Integer, Integer> hm, int x)
    {
          hm.remove(x);
    }
    void sorted_By_Key(TreeMap<Integer, Integer> hm)
    {
   for(Map.Entry<Integer, Integer> m: hm.entrySet())
   {
       System.out.print(m.getKey()+" ");
   }
    }   
}

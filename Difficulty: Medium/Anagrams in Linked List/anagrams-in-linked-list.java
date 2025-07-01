// User function Template for Java
/*

Definition for singly Link List Node
class Node
{
    char data;
    Node next;

    Node(char x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/
class Solution {
    public static ArrayList<Node> findAnagrams(Node head, String s) {
        // code here
        
        ArrayList<Node> list=new ArrayList<>();
        Node i=head,j=head;
        HashMap<Character,Integer> map=new HashMap<>();
        int j1=0;  //  j1 just same as j-i+1 in sliding window
        
        for(int k=0;k<s.length();k++){
            map.put(s.charAt(k),map.getOrDefault(s.charAt(k),0)+1);
            // System.out.println(s.charAt(k)+"  -> "+map.get(s.charAt(k)));
        }
        
        int count=map.size();
        
        while(j!=null){
          j1++;
            if(map.containsKey(j.data)){
                map.put(j.data,map.get(j.data)-1);
                if(map.get(j.data)==0)
                count--;
            }
            
            if(j1<s.length()){
            j=j.next;
            }
            else{
                if(j1==s.length()){
                if(count==0){
                    Node temp=i;
                    i=j.next;
                    j.next=null;
                    j=i;
                    j1=0;
                    list.add(temp);
                    Node left=temp;
                    while(left!=null){
                        if(map.containsKey(left.data)){
                            map.put(left.data,map.get(left.data)+1);
                            if(map.get(left.data)==1)
                            count++;
                        }
                        left=left.next;
                    }
                    
                }
                else{
                    if(map.containsKey(i.data)){
                        map.put(i.data,map.get(i.data)+1);
                        if(map.get(i.data)==1)
                        count++;
                    }
                    i=i.next;
                    j=j.next;
                    j1--;
                    
                }
                
                }
               
            }
        }
        return list;
    }
}


class LRUCache {
    static int capacity;
    static ListNode head,tail;
    static Map<Integer,ListNode> map;
    static class ListNode{
        int key,val;
        ListNode next,prev;
        public ListNode(int key,int val){
            this.key=key;
            this.val=val;
            this.next=null;
            this.prev=null;
        }
    }
    // Constructor for initializing the cache capacity with the given value.
    LRUCache(int cap) {
        // code here
        this.capacity=cap;
        this.map=new HashMap<>();
        this.head=new ListNode(-1,-1);
        this.tail=new ListNode(-1,-1);
        this.tail.next=head;
        this.head.prev=tail;
    }

    // Function to return value corresponding to the key.
    public static int get(int key) {
        // your code here
        if(map.containsKey(key)){
            ListNode node=map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    private static void remove(ListNode node){
        ListNode prev=node.prev;
        ListNode next=node.next;
        prev.next=next;
        next.prev=prev;
    }
    private static void insert(ListNode newNode){
        ListNode temp=head.prev;
        newNode.next=head;
        newNode.prev=temp;
        head.prev=newNode;
        temp.next=newNode;
    }
    // Function for storing key-value pair.
    public static void put(int key, int value) {
        // your code here
        if(capacity!=0&&!map.containsKey(key)){
            capacity--;
            ListNode node=new ListNode(key,value);
            insert(node);
            map.put(key,node);
        } else if(map.containsKey(key)){
            ListNode updateNode=map.get(key);
            updateNode.val=value;
            remove(updateNode);
            insert(updateNode);
            map.put(key,updateNode);
        } else {
            ListNode node=new ListNode(key,value);
            insert(node);
            map.put(key,node);
            ListNode del=tail.next;
            remove(del);
            map.remove(del.key);
        }
    }
}


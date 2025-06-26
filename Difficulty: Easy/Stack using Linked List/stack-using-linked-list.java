
class MyStack {
    StackNode top;
    void push(int a) {
        StackNode newNode=new StackNode(a);
        newNode.next=top;
        top=newNode;
    }
    int pop() {
        if(top==null)return -1;
        int pop=top.data;
        top=top.next;
        return pop;
    }
}
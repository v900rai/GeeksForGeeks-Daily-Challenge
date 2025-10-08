/*
class Node {
public:
    int data;
    Node *left;
    Node *right;

    Node(int x) {
        data = x;
        left = NULL;
        right = NULL;
    }
};
*/
class Solution {
  public:
    Node * solve(vector<int> &pre, int preSt, int preEn, vector<int> &post, int postSt, int postEn)
    {
        if(preSt>preEn)
        return NULL;
        if(preSt==preEn)
        return new Node(pre[preSt]);
        Node * head = new Node(pre[preSt]);
        int i = 0;
        while(postSt+i<=postEn && pre[preSt+1]!=post[postSt+i])
        i++;
        head->left = solve(pre, preSt+1, preSt+i+1, post, postSt, postSt+i);
        head->right = solve(pre, preSt+2+i, preEn, post, postSt+1+i, postEn-1);
        return head;
    }
    Node *constructTree(vector<int> &pre, vector<int> &post) {
        Node * root = solve(pre, 0, pre.size()-1, post, 0, post.size()-1);
        return root;
    }
};
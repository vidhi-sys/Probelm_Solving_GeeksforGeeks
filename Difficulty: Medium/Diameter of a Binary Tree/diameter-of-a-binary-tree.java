/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    static int max_d=0;
    public int max_h(Node root){
        if(root==null){
            return 0;
            
        }
        int l=max_h(root.left);
          int r=max_h(root.right);
          if(l+r>max_d){
              max_d=l+r;
          }
          return 1+Math.max(l,r);
        
    }
    public int diameter(Node root) {
        // code here
        max_d=0;
        max_h(root);
        return max_d;
        
    }
}
/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
           if (root==null){
            return -1;
        }
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    
        
    }
}
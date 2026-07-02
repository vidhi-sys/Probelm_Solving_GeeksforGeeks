/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public int getSize(Node root) {
        // code here
        
        if(root==null){
            return 0;
        }
        int left = getSize(root.left);
        int right = getSize(root.right);

        // return the size of curr subtree.
        return left + right + 1;
        
    }
}
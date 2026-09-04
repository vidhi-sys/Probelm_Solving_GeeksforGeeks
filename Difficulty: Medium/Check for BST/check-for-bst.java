/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class triplet{
    int min;
    int max;
    boolean isbst;
    triplet(int min,int max, boolean isbst){
        this.min=min;
        this.max=max;
        this.isbst=isbst;
    }
    
}
class Solution {
    public boolean isBST(Node root) {
        return minmax(root).isbst;
        // code here
        
    }
    triplet minmax(Node root){
        if (root==null){
            return new triplet(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
        }
        triplet lst=minmax(root.left);
        triplet rst= minmax(root.right);
        int max=Math.max(root.data,Math.max(lst.max,rst.max));
        int min=Math.min(root.data,Math.min(lst.min,rst.min));
        boolean isbst= ((lst.isbst&&rst.isbst)&&(lst.max<root.data&&rst.min>root.data));
        return new triplet(min,max,isbst);
    }
}
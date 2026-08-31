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
}
*/

class Solution {
    public int minValue(Node root) {
        // code here
        
            Node temp= root;
            int val=0;
            while(temp.left!=null){
                temp=temp.left;
                
            }
            if(temp==null){
                val=-1;
            }else{
            val= temp.data;}
            return val;
    }
}
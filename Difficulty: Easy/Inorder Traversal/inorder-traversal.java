class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> pre = new ArrayList<>();
        inorder(root, pre);
        return pre;
    }

    private void inorder(Node root, ArrayList<Integer> pre) {
        if (root == null) {
            return;
        }

        
        inorder(root.left, pre);
        pre.add(root.data);
        inorder(root.right, pre);
    }
}
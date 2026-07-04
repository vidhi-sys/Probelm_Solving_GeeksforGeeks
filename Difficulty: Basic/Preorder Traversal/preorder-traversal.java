class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> pre = new ArrayList<>();
        preorder(root, pre);
        return pre;
    }

    private void preorder(Node root, ArrayList<Integer> pre) {
        if (root == null) {
            return;
        }

        pre.add(root.data);
        preorder(root.left, pre);
        preorder(root.right, pre);
    }
}
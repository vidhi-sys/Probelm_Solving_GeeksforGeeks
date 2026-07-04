class Solution {

    public boolean symm(Node left, Node right) {
        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;

        return left.data == right.data &&
               symm(left.left, right.right) &&
               symm(left.right, right.left);
    }

    public boolean isSymmetric(Node root) {
        if (root == null)
            return true;

        return symm(root.left, root.right);
    }
}
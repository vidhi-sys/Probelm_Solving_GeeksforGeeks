class Solution {
    Node lca(Node root, int n1, int n2) {

        // Base case
        if (root == null) {
            return null;
        }

        // If either n1 or n2 matches root
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        // Recur for left and right subtrees
        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);

        // If both sides return non-null, this is LCA
        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        // Otherwise return the non-null child
        return (leftLCA != null) ? leftLCA : rightLCA;
    }
}

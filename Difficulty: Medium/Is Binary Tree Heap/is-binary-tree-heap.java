/*
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {

    int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    boolean isCBT(Node root, int index, int totalNodes) {
        if (root == null) {
            return true;
        }

        if (index >= totalNodes) {
            return false;
        }

        return isCBT(root.left, 2 * index + 1, totalNodes)
                && isCBT(root.right, 2 * index + 2, totalNodes);
    }

    boolean isMaxHeap(Node root) {
        if (root == null) {
            return true;
        }

        if (root.left != null && root.left.data > root.data) {
            return false;
        }

        if (root.right != null && root.right.data > root.data) {
            return false;
        }

        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }

    public boolean isHeap(Node tree) {
        int totalNodes = countNodes(tree);

        return isCBT(tree, 0, totalNodes) && isMaxHeap(tree);
    }
}
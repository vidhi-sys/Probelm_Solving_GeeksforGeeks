class Triplet {
    int min;
    int max;
    int size;
    boolean isbst;

    Triplet(int min, int max, int size, boolean isbst) {
        this.min = min;
        this.max = max;
        this.size = size;
        this.isbst = isbst;
    }
}

class Solution {
    static int max_size;

    public int largestBst(Node root) {
        max_size = 0;
        minmax(root);
        return max_size;
    }

    Triplet minmax(Node root) {

        // Empty tree
        if (root == null) {
            return new Triplet(
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                0,
                true
            );
        }

        Triplet left = minmax(root.left);
        Triplet right = minmax(root.right);

        boolean isbst =
            left.isbst &&
            right.isbst &&
            left.max < root.data &&
            right.min > root.data;

        int min = Math.min(
            root.data,
            Math.min(left.min, right.min)
        );

        int max = Math.max(
            root.data,
            Math.max(left.max, right.max)
        );

        int size = 1 + left.size + right.size;

        if (isbst) {
            max_size = Math.max(max_size, size);
        }

        return new Triplet(min, max, size, isbst);
    }
}
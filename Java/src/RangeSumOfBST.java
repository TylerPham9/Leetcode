class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null){
            return 0;
        }
        if (root.val < L){
            return rangeSumBST(root.right, L, R);
        }
        if (root.val > R){
            return rangeSumBST(root.left, L, R);
        }

        return (root.val + rangeSumBST(root.right, L, R) +
                rangeSumBST(root.left, L, R));

    }
    public static void main(String[] args){
        RangeSumOfBST s = new RangeSumOfBST();
    }
}

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return root;
        }
        if(root.left == null && root.right == null) {
            return root;
        }
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;

        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTree s = new InvertBinaryTree();
        TreeNode input = new TreeNode(4);
        input.left = new TreeNode(2);
        input.left.left = new TreeNode(1);
        input.left.right = new TreeNode(3);
        input.right = new TreeNode(7);
        input.right.left = new TreeNode(6);
        input.right.right = new TreeNode(7);

        TreeNode result = s.invertTree(input);

    }

}

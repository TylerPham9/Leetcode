//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}


class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }
    private TreeNode constructMaximumBinaryTree(int[] nums, int start, int end){
        if (start > end) {
            return null;
        }
        int largestIndex = end;
        // Find largest
        for (int i = start; i < end; i++){
            if (nums[largestIndex] < nums[i]){
                largestIndex = i;
            }
        }
        TreeNode root = new TreeNode(nums[largestIndex]);
        root.left = constructMaximumBinaryTree(nums, start, largestIndex-1);
        root.right = constructMaximumBinaryTree(nums, largestIndex+1, end);
        return root;
    }

    public static void main(String[] args) {
        MaximumBinaryTree s = new MaximumBinaryTree();
        int[] input = {3,2,1,6,0,5};
        s.constructMaximumBinaryTree(input);


    }
}

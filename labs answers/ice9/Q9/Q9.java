public class Q9 {

    public static boolean isBalanced(TreeNode node) {
        if (node == null) {
            return true;
        }

        TreeNode leftNode = node.getLeft();
        TreeNode rightNode = node.getRight();

        int leftHeight = getHeight(leftNode);
        int rightHeight = getHeight(rightNode);
        
        if (Math.abs(leftHeight - rightHeight) <= 1 
                    && isBalanced(leftNode) 
                    && isBalanced(rightNode)) {
            return true;
        }
        return false;
    }

    public static int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return 1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));
    }
}
public class BinaryTreeTest {

    public static void main(String[] args) {
        System.out.println("TEST 1");
        TreeNode root = init_1();
        System.out.println("Expected: true");
        System.out.println("Actual: " + Q9.isBalanced(root));

        System.out.println("\nTEST 2");
        root = init_2();
        System.out.println("Expected: false");
        System.out.println("Actual: " + Q9.isBalanced(root));
        
    }

    public static TreeNode init_1() {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(9));
        root.setRight(new TreeNode(3));

        TreeNode current = root.getRight();
        current.setRight(new TreeNode(7));
        current.setLeft(new TreeNode(5));
        return root;
    }

    public static TreeNode init_2() {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(2));

        TreeNode current = root.getLeft();
        current.setRight(new TreeNode(3));
        current.setLeft(new TreeNode(3));

        current = current.getLeft();
        current.setRight(new TreeNode(4));
        current.setLeft(new TreeNode(4));
        return root;
    }
}
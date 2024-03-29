public class TreeInversion {
    public static void main(String[] arr) {
        TreeNode a = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode b = new TreeNode(8, new TreeNode(5), new TreeNode(6));
        TreeNode root = new TreeNode(1, a, b);
        Utilities helper = new Utilities();
        helper.printTree(root);
        System.out.println();
        helper.printTree(root.invertTree(root));
        System.out.println();
        helper.printTree(root.invertTree(root));
    }
    
}



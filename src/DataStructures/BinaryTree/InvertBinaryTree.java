package DataStructures.BinaryTree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
      }
  }

class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }

        var left = root.left;
        var right = root.right;

        root.right = left;
        root.left = right;

        invertTree(left);
        invertTree(right);

        return root;

    }
}
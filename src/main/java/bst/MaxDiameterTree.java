package bst;

/**
 * Created by saurabh on 5/6/18.
 */
public class MaxDiameterTree {

   public static void main(String [] args) {

       TreeNode root = new TreeNode(1);
       root.left = new TreeNode(2);
       root.left.right = new TreeNode(5);
       root.left.left = new TreeNode(4);
       root.right = new TreeNode(3);
       //root.right.right = new TreeNode(7);
       TreeNode.displayInorder(root);
       System.out.println("________");
       System.out.println(diameterOfBinaryTree(root));
   }

    public static  int diameterOfBinaryTree(TreeNode root) {
        return diameterBt(root, root);
    }

    private static int diameterBt(TreeNode node, TreeNode root) {
        int diameter=0;
        if(node!=null){

            int leftD=diameterBt(node.left, root);
            int rightD=diameterBt(node.right,root);
            if(node==root)
                diameter=Math.max(leftD+rightD+1,diameter);
            else{
                diameter=Math.max(Math.max(leftD,rightD)+1,diameter);
            }
        }
    return diameter;
   }


}

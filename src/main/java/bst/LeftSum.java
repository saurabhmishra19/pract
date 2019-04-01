package bst;

/**
 * Created by saurabh on 5/6/18.
 */
public class LeftSum {

    public static void main(String [] args){


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
         root.left.right = new TreeNode(5);
         root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        //root.right.right = new TreeNode(7);
        TreeNode.displayInorder(root);
        System.out.println("________");
        System.out.println(sumOfLeftLeaves(root));
    }


    public static int sumOfLeftLeaves(TreeNode root) {
        return sumLeft(root, false);
    }

    private static int sumLeft(TreeNode node, boolean isLeft) {
        int sum=0;
        if(null!=node){
            if(isLeft && isLeaf(node)){
                System.out.println(" left "+node.val);
                sum+=node.val;
            }
            sum+=sumLeft(node.left,true)+sumLeft(node.right, false);
        }
        return sum;

    }
    public static boolean isLeaf(TreeNode node){
        return node !=null && node.left==null && node.right==null;
    }




}

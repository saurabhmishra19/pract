package bst;

/**
 * Created by saurabh on 5/6/18.
 */
public class SecandHighest {


    public static void main(String [] args) {


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        //root.right.right = new TreeNode(7);
        TreeNode.displayInorder(root);
        System.out.println("________");
    }
    public int findSecondMinimumValue(TreeNode root) {
    return 0;
    }
    public static int findSecand(TreeNode root){
        int firstS=-1;
        int secand=-1;

       // if(root.val<first)

    return 0;
    }


}

package bst;

/**
 * Created by saurabh on 30/5/18.
 */
public class InvertTree {

    public static  void main(String [] args){



        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(0);
        root.left.right=new TreeNode(2);
        root.left.right.left=new TreeNode(1);
        root.right=new TreeNode(4);
        TreeNode.displayInorder(root);
        System.out.println("________");
        TreeNode.displayInorder(invertTree(root));
    }

    public static TreeNode invertTree(TreeNode node){
        TreeNode pNode=node;

        invert(pNode);

        return pNode;


    }

    private static void invert(TreeNode node){

        if(node!=null){
            TreeNode tmp=node.left;
            node.left=node.right;
            node.right=tmp;
            invert(node.left);
            invert(node.right);

        }


    }








}

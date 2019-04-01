package bst;

/**
 * Created by saurabh on 27/5/18.
 */
public class MergeBinaryTree {


    public static void main(String [] args){
        // prepareTree

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(3);
        root.left.left=new TreeNode(5);
        root.right=new TreeNode(2);

        displayInorder(root);

        TreeNode root2=new TreeNode(2);
        root2.left=new TreeNode(1);
        root2.left.right=new TreeNode(4);
        root2.right=new TreeNode(3);
        root2.right.right=new TreeNode(7);
        System.out.println("____________");
        displayInorder(root2);
        System.out.println("____________");
        TreeNode newTree= mergeTwo(root, root2);

        System.out.println("____________");

        displayInorder(newTree);



    }

    public static void displayInorder(TreeNode node){


        if(node!=null){

            displayInorder(node.left);
            System.out.println(node.val);
            displayInorder(node.right);
        }

    }

    public static TreeNode mergeTwo(TreeNode root, TreeNode root1){

        TreeNode newR=null;

        if(root!=null || null!=root1){
            newR=new TreeNode(0);
            int val=0;
            if(root!=null)
                val+=root.val;
            if(root1!=null)
                val+=root1.val;
            newR.val=val;
        //    System.out.println(val);
            if(root!=null && root1!=null){
                newR.left= mergeTwo(root.left, root1.left);
                newR.right=mergeTwo(root.right, root1.right);
            }else if(root!=null && root1==null){
                newR.left= mergeTwo(root.left, null);
                newR.right=  mergeTwo(root.right, null);
            }
            else if(root==null && root1!=null){
                newR.left=mergeTwo(null, root1.left);
                newR.right= mergeTwo(null, root1.right);
            }



        }

        return newR;

    }




}

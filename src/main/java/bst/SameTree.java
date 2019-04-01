package bst;

/**
 * Created by saurabh on 5/6/18.
 */
public class SameTree {

    public static void main(String [] args){

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
         /* root.left.right = new TreeNode(4);
         root.left.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(7);*/

        TreeNode root1 = new TreeNode(2);
        /*root1.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.left.left = new TreeNode(2);*/
        root1.right = new TreeNode(1);
        //root1.right.right = new TreeNode(7);


        TreeNode.displayInorder(root);
        System.out.println("________");

        System.out.println(isSameTree(root, root1));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        return isSame(p,q);

    }

    public static boolean isSame(TreeNode p, TreeNode q){
        boolean isSame=true;//assumption
        if(null==p && null==q){

            return true;
        }else if(null!=p && null!=q) {

            if (p.val == q.val) {

                isSame = (isSame(p.left, q.left) && isSame(p.right, q.right)) == false ? false : isSame;

            } else
                isSame = false;
        }
        else if((null==p && null!=q)|| (null!=p && null==q)){
            isSame=false;
        }


        return isSame;
    }






}

package bst;

/**
 * Created by saurabh on 27/5/18.
 */
public class TrimBT {


    public  static void main(String [] args){

        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(0);
        root.left.right=new TreeNode(2);
        root.left.right.left=new TreeNode(1);
        root.right=new TreeNode(4);
        TreeNode.displayInorder(root);
        System.out.println("________");
        TreeNode.displayInorder(trimNode(root, null,1, 3));


    }

    public static TreeNode trimBST(TreeNode root, int L, int R) {
        //TreeNode
        TreeNode node=null;
        if(root!=null){
            System.out.println(root.val);
            System.out.println(root.val<=R && root.val>=L);
            if(root.val<=R && root.val>=L){

                node=new TreeNode(root.val);

                node.left=trimBST(root.left,L,R);
                node.right=trimBST(root.right,L,R);

            }else{
                node.left=trimBST(root.left,L,R);
                node.right=trimBST(root.right,L,R);
            }

        }


        return node;
    }

    public static TreeNode trimNode(TreeNode root, TreeNode cur, int L , int R){

        //TreeNode
        TreeNode node=null;
        if(root!=null){
            System.out.println(root.val);
            System.out.println(root.val<=R && root.val>=L);
            if(root.val<=R && root.val>=L){
                if(cur==null)
                cur=new TreeNode(root.val);

                cur.left=trimNode(root.left,cur.left,L,R);
                cur.right=trimNode(root.right,cur.right,L,R);

            }else{
                if(cur==null)
                    cur=trimNode(root.left,cur,L,R);
                cur.right=trimNode(root.right,cur.right,L,R);
            }

        }


        return node;



    }












}

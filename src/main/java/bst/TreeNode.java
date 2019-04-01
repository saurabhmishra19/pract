package bst;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

      @Override
    public String toString(){

          return ""+val;

      }

    public static void displayInorder(TreeNode node){


        if(node!=null){

            displayInorder(node.left);
            System.out.println(node.val);
            displayInorder(node.right);
        }

    }


    public static int height(TreeNode root){

        return heightVal(root);
    }

    private static int heightVal(TreeNode node) {
        int height=0;
        if(node!=null){

           int lH= heightVal(node.left)+1;
           int rH=heightVal(node.right)+1;

           height=Math.max(lH,rH);

        }
        return height;
    }


}

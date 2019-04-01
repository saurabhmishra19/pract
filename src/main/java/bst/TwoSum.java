package bst;

/**
 * Created by saurabh on 30/5/18.
 */
public class TwoSum {


    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
      //  root.left.right = new TreeNode(4);
       // root.left.left = new TreeNode(2);
        root.right = new TreeNode(3);
        //root.right.right = new TreeNode(7);
        TreeNode.displayInorder(root);
        System.out.println("________");
        System.out.println("search:: "+search(root,4));
        System.out.println(findTarget(root, 4));
    }
    public static boolean findTarget(TreeNode root, int k) {


        return findTarget(root,root, k,k);
    }

    public static boolean findTarget(TreeNode root,TreeNode node, int k,int original) {

        boolean found=false;

           if(node!=null){
               found=search(root,k)?true:found;
               found=findTarget(root, node.left,original-node.val,original)||
                       findTarget(root, node.right,original-node.val,original)?true:found;

           }

        return found;
    }

    public static boolean search(TreeNode root, int val){
        boolean found=false;
        if(root!=null) {
            if (val == root.val)
                return true;
            else if (val < root.val) {
               found= search(root.left, val)?true:found;

            }else
                found= search(root.right, val)?true:found;


        }
        return found;
    }



    private static boolean findT(TreeNode root, int val, int count, int originalVal) {

        boolean found = false;
        if (root != null) {
            System.out.println(val+"-- "+root.val+"  "+count);

             if (val > root.val && count==0) {
                found = findT(root.left, val - root.val, count + 1,originalVal) || findT(root.right, val - root.val, count + 1,originalVal);
            } else if (val == root.val && count == 1) {
                return true;
            }else{

                 found = findT(root.left, val , count,originalVal ) || findT(root.right, val, count ,originalVal);
             }

             found=found?true:(findT(root.left,originalVal,0,originalVal)|| findT(root.right,originalVal,0,originalVal));
            return found;
        } else {
            return false;
        }
    }

}

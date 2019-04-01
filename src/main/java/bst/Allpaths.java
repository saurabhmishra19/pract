package bst;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by saurabh on 5/7/18.
 */
public class Allpaths {

    public static  void main(String [] args){

        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(0);
        root.left.right=new TreeNode(2);
        root.left.right.left=new TreeNode(1);
        root.right=new TreeNode(4);
        TreeNode.displayInorder(root);
        System.out.println("________");
        System.out.println(binaryTreePaths(root));

    }


    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> all=new ArrayList<>();
            StringBuffer path=new StringBuffer();
        StringBuffer parent=new StringBuffer();
        Stack<String> stack=new Stack<>();
            if(root!=null){

                stack.push(root.val+"");
                binaryTreepath(root.left,all, stack);
                binaryTreepath(root.right,all,stack);
            }



        return all;
    }


    public static void binaryTreepath(TreeNode node,List<String> values, Stack<String> stack){

        if(node!=null){
            stack.push(stack.peek()+"->"+node.val+"");
            if(isChid(node)){
                values.add(stack.peek());

            }
                binaryTreepath(node.left, values, stack);

                binaryTreepath(node.right, values, stack);
                    stack.pop();

        }


    }

    public static boolean isChid(TreeNode root){
        return root!=null && root.left==null && root.right==null;
    }




}

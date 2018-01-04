package bst;

import sun.reflect.generics.tree.Tree;

public class BSTImpl {

    public TreeNode root;

    public void add(int data){
        root=add(data,root);
    }

    private TreeNode add(int data, TreeNode node){
        if(node==null)
            node=new TreeNode(data);
        else if(data<node.val)
        {
            node.left=add(data,node.left);
        }else
        {
            node.right=add(data, node.right);
        }
        return node;
    }

    public void inorderTravesal(){
        inorderTrav(root);
    }
    private void inorderTrav(TreeNode node){
        if(node!=null) {
            inorderTrav(node.left);
            System.out.println(node.val);
            inorderTrav(node.right);
        }
    }
    public void swapTree(){
        swapTree(root);
    }

    public int height(){

        return height(root);
    }
    private int height(TreeNode node){
        if(null !=node){

            int lHigh=height(node.left);
            int rHigh=height(node.right);
            if(lHigh>rHigh)
                return lHigh+1;
            else
                return rHigh+1;
        }else
            return 0;
    }

    private TreeNode swapTree(TreeNode node){
        return null;
    }

    public void printDirectoryStructuredTree(){
        int height=height();
        printDirectoryStructuredTree(root, height, height, 'C');
    }
    public void printDirectoryStructuredTree(TreeNode node, int height, int curr, char s){
        if(node !=null) {
            for (int k = height - curr; k > 0; k--) {
                System.out.print(" ");
            }
            curr=curr-1;
            System.out.print(s+"-"+node.val);
            System.out.println("");
            printDirectoryStructuredTree(node.left,height,curr, 'L');
            printDirectoryStructuredTree(node.right,height,curr,'R');
        }
    }
}

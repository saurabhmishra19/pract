package bst;

import sun.reflect.generics.tree.Tree;

import java.util.Random;

public class BSTImpl {

    public TreeNode root;

    public int count;

    public void add(int data) {
        root = add(data, root);
    }

    private TreeNode add(int data, TreeNode node) {
        if (node == null) {
            count++;
            node = new TreeNode(data);
        }
        else if (data < node.val) {
            node.left = add(data, node.left);
        } else {
            node.right = add(data, node.right);
        }
        return node;
    }

    public void inorderTravesal() {
        inorderTrav(root);
    }

    private void inorderTrav(TreeNode node) {
        if (node != null) {
            inorderTrav(node.left);
            System.out.println(node.val);
            inorderTrav(node.right);
        }
    }

    public void swapTree() {
        swapTree(null, root);
    }

    private TreeNode swapTree(TreeNode parent, TreeNode node) {
        if (null != node) {
            swapTree(node, node.left);
            TreeNode tmp = parent.left;
            parent.left = parent.right;
            parent.right = tmp;

            swapTree(node, node.right);
        }
        return null;
    }

    public int height() {

        return height(root);
    }

    private int height(TreeNode node) {
        if (null != node) {

            int lHigh = height(node.left);
            int rHigh = height(node.right);
            if (lHigh > rHigh)
                return lHigh + 1;
            else
                return rHigh + 1;
        } else
            return 0;
    }


    public void DFS() {
        int height = height();
        height = height - 2;
        for (; height >= 0; height--) {
            DFS(root, height, height);
        }
    }

    private boolean isLeaf(TreeNode node) {
        return null == node.left && null == node.right;
    }

    private void DFS(TreeNode node, int height, int currHeight) {
        if (null != node) {


            if (currHeight != 0) {
                currHeight = currHeight - 1;
                DFS(node.left, height, currHeight);
                DFS(node.right, height, currHeight);
            } else if (currHeight == 0) {
                if (!isLeaf(node)) {
                    swapNode(node);
                }
                System.out.println("DFS" + node.val);
            }
        }

    }

    private void swapNode(TreeNode node) {
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;

    }


    public void printDirectoryStructuredTree() {
        int height = height();
        printDirectoryStructuredTree(root, height, height, 'C');
    }

    public void printDirectoryStructuredTree(TreeNode node, int height, int curr, char s) {
        if (node != null) {
            for (int k = height - curr; k > 0; k--) {
                System.out.print(" ");
            }
            curr = curr - 1;
            System.out.print(s + "-" + node.val);
            System.out.println("");
            printDirectoryStructuredTree(node.left, height, curr, 'L');
            printDirectoryStructuredTree(node.right, height, curr, 'R');
        }
    }


    public void twoRandomNodeSwapper(TreeNode node){
        Random rm=new Random();
        int firstNode=rm.nextInt(count);
        int secandNode=rm.nextInt(count);

    }

    public TreeNode findNthNodeInorder(int n){

      return  findNthNodeInorder(root, n,1);
    }


    private TreeNode findNthNodeInorder(TreeNode node, int n, int curr){
        TreeNode currN=null;
        if(n==curr){
            currN= node;
        }else{
            currN=findNthNodeInorder(node.left, n, curr+1);
            currN=findNthNodeInorder(node.right, n, curr+1);
        }
        return currN;
    }

}

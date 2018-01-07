package bst;

import java.util.ArrayList;
import java.util.List;
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
        } else if (data < node.val) {
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


    public void twoRandomNodeSwapper(TreeNode node) {
        Random rm = new Random();
        int firstNode = rm.nextInt(count);
        int secandNode = rm.nextInt(count);

    }

    public TreeNode findNthNodeInorder(int n) {

        return findNthNodeInorder(root, n, 1);
    }


    private TreeNode findNthNodeInorder(TreeNode node, int n, int curr) {
        TreeNode currN = null;
        if (n == curr) {
            currN = node;
        } else {
            currN = findNthNodeInorder(node.left, n, curr + 1);
            currN = findNthNodeInorder(node.right, n, curr + 1);
        }
        return currN;
    }

    public void prepareBadTree(){
        prepareBadTree(root);
    }
    private void prepareBadTree(TreeNode node) {

        if (node != null) {
            if (node.val == 7)
                node.val = 9;
            else if (node.val == 9)
                node.val = 7;

            prepareBadTree(node.left);
            prepareBadTree(node.right);

        }


    }

    public void fixTree(TreeNode node){




    }


    public TreeNode findIncorrectNode(TreeNode node, TreeNode wrongF ){

        if(node!=null
                //&& wrongF==null
                ){

            if(null!= node.left){
                if(node.val<node.left.val){
                    wrongF= node;
                }
            }
            if(null!=node.right){
                if(node.val>node.right.val){
                    wrongF= node;
                }
            }
            wrongF= findIncorrectNode(node.left, wrongF);
            wrongF= findIncorrectNode(node.right, wrongF);

        }
        return wrongF;

    }


    public List<TreeNode> inorderList(TreeNode root){
        List values=new ArrayList<TreeNode>();

        inorderList(root,values);

     return values;
    }

    private void inorderList(TreeNode node,List values) {

    if(node!=null){

        inorderList(node.left, values);
        values.add(node);
        inorderList(node.right,values);

    }

    }

    public List<TreeNode> replaceIncorrectSwaps(List<TreeNode> values){
        boolean incorrect=false;
        TreeNode incorrectNode=null;
        TreeNode replaceNode=null;
        for(int i=0;i< values.size();i++){
            for(int j=i+1;j<values.size() && !incorrect;j++){
                if(!incorrect && values.get(i).val>values.get(j).val)
                {
                    incorrect=true;
                    incorrectNode=values.get(i);
                }



            }

            if(incorrect){
                if(values.get(i).val<incorrectNode.val){
                    replaceNode=values.get(i);

                }

            }
        }

        if(incorrect){
            int tmp=incorrectNode.val;
            incorrectNode.val=replaceNode.val;
            replaceNode.val=tmp;
        }


        return values;
    }



    public int maxPathSum(TreeNode root){

        return maxSum(root);
    }

    private int maxSum(TreeNode node ){
        int leftSum=0;
        int rightSum=0;
        if(null !=node){
            leftSum=node.val+maxSum(node.left);
            rightSum=node.val+maxSum(node.right);
            return leftSum>rightSum?leftSum:rightSum;
        }
        return 0;

    }



    private int maxSumLeetStyle(TreeNode node, int maxValueTill ){
        int leftSum=0;
        int rightSum=0;
        if(null !=node){

            leftSum=maxSumLeetStyle(node.left,maxValueTill);
            rightSum=maxSumLeetStyle(node.right, maxValueTill);



            if(maxValueTill+leftSum>maxValueTill)
                maxValueTill=maxValueTill+leftSum;
            if(maxValueTill+rightSum>maxValueTill)
                maxValueTill+=rightSum;
            if(maxValueTill+node.val>maxValueTill)
                maxValueTill+=node.val;
            return maxValueTill;
        }
        return 0;

    }













}

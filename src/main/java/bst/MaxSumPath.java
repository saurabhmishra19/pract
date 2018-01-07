package bst;

/**
 * Created by saurabh on 7/1/18.
 */
public class MaxSumPath {




    public int maxPathSum(TreeNode root) {
        return maxSum(root,Integer.MIN_VALUE);
    }

    private int maxSum(TreeNode node,int maxValueTill ){

        int leftSum=0;
        int rightSum=0;

        if(null !=node){
            if(isLeaf(node)){
                return node.val;
            }
            if(node.left==null && !isLeaf(node))
                leftSum=node.val;
            else
            leftSum=maxSum(node.left,maxValueTill);
            if(node.right==null && !isLeaf(node))
                rightSum=node.val;
            else if(maxValueTill==Integer.MIN_VALUE)
                maxValueTill=node.val;
            else if(maxValueTill+node.val>maxValueTill)
                maxValueTill+=node.val;

            else
            rightSum=maxSum(node.right, maxValueTill);
            if(maxValueTill+leftSum>maxValueTill)
                maxValueTill=maxValueTill+leftSum;
            else if(leftSum>maxValueTill)
                maxValueTill=leftSum;
            if(maxValueTill+rightSum>maxValueTill)
                maxValueTill+=rightSum;
            else if(rightSum>maxValueTill)
                maxValueTill=rightSum;


            return maxValueTill;
        }
        return 0;
    }

    private boolean isLeaf(TreeNode node) {
        return null == node.left && null == node.right;
    }

}

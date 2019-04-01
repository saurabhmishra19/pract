package bst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saurabh on 30/5/18.
 */
public class AverageValue {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);
        root.right = new TreeNode(4);
        TreeNode.displayInorder(root);
        System.out.println("________");
        System.out.println(TreeNode.height(root));
        System.out.println(averageVal(root));
        Solution s=new Solution();
        System.out.println(s.averageOfLevels(root));
    }

    public static List<Float> averageVal(TreeNode root){
        List<Float> allVal=new ArrayList<>();
        int height=TreeNode.height(root);
        for(int i=0;i<height;i++){
            LevelHolder levelHol=new LevelHolder();
            averageLevel(root, i,levelHol);
            allVal.add(levelHol.sum/levelHol.count);

        }

        return allVal;

    }
    static class LevelHolder{
        int count;
        float sum;

    }
    private static void averageLevel(TreeNode root, int i,LevelHolder levelHol) {

        if(root!=null) {
            if (i != 0) {

                i -= 1;
                averageLevel(root.left, i,levelHol);
                averageLevel(root.right, i,levelHol);

            }else {
                levelHol.sum+=root.val;
                levelHol.count++;

            }
        }

    }


}

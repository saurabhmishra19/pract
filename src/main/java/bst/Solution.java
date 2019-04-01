package bst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saurabh on 30/5/18.
 */
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        return averageVal( root);
    }
    public  int height(TreeNode root){

        return heightVal(root);
    }

    private  int heightVal(TreeNode node) {
        int height=0;
        if(node!=null){

            int lH= heightVal(node.left)+1;
            int rH=heightVal(node.right)+1;

            height=Math.max(lH,rH);

        }
        return height;
    }


    public List<Double> averageVal(TreeNode root){
        List<Double> allVal=new ArrayList<>();
        int height=height(root);
        for(int i=0;i<height;i++){
            LevelHolder levelHol=new LevelHolder();
            averageLevel(root, i,levelHol);
            allVal.add(levelHol.sum/levelHol.count);

        }

        return allVal;

    }
    static class LevelHolder{
        int count;
        double sum;

    }
    private  void averageLevel(TreeNode root, int i,LevelHolder levelHol) {

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

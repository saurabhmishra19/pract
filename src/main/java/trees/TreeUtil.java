package trees;

/**
 * Created by saurabh on 5/7/18.
 */
public class TreeUtil {


    public static void dispalyTreePreOder(TreeNodeUnDirected tree){


        if(tree!=null){
            System.out.println(tree.val);
            tree.getLinks().forEach(TreeUtil::dispalyTreePreOder);
        }


    }



}

package bst;

import java.util.ArrayList;
import java.util.List;

public class BstTest {

    public static void main(String [] args){

        BSTImpl bst=new BSTImpl();

       // bst.add(0);
      //  bst.add(1);
        bst.add(1);
        bst.add(2);
        bst.add(7);
        bst.add(6);
        bst.add(9);
        bst.printDirectoryStructuredTree();
       // bst.inorderTravesal();

       // System.out.println("ROOT ele "+bst.root);
        //System.out.println("Height "+bst.height());
  /*      System.out.println("Before swap");
        bst.printDirectoryStructuredTree();
     //   bst.swapTree();
      //  bst.DFS();
        bst.prepareBadTree();

        System.out.println("After swap");

        bst.printDirectoryStructuredTree();
        TreeNode wrongf= bst.findIncorrectNode(bst.root, null);
        System.out.println("wrong val "+wrongf);

        System.out.println(bst.inorderList(bst.root));

        bst.replaceIncorrectSwaps(bst.inorderList(bst.root));
        bst.printDirectoryStructuredTree();


        List<TreeNode> val=new ArrayList<TreeNode>();
        val.add(new TreeNode(3));
        val.add(new TreeNode(2));
        val.add(new TreeNode(1));

      System.out.println(bst.replaceIncorrectSwaps(val));*/


        System.out.println(bst.maxPathSum(bst.root));


    }





}

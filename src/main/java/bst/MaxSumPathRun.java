package bst;

/**
 * Created by saurabh on 7/1/18.
 */
public class MaxSumPathRun {


    public static void main(String [] args){

        BSTImpl bst=new BSTImpl();

        // bst.add(0);
        //  bst.add(1);

        bst.add(7);
        bst.add(1);
        bst.add(2);
       bst.add(6);
        bst.add(9);
        bst.printDirectoryStructuredTree();

        MaxSumPath path=new MaxSumPath();

        System.out.println(path.maxPathSum(bst.root));
        BSTSerialization bSTSerialization=new BSTSerialization();
        String sr=bSTSerialization.serialize(bst.root);
        bSTSerialization.deserialize(sr);

    }

}

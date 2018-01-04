package bst;

public class BstTest {

    public static void main(String [] args){

        BSTImpl bst=new BSTImpl();

        bst.add(0);
        bst.add(1);
       /* bst.add(1);
        bst.add(2);
        bst.add(7);
        bst.add(6);
        bst.add(9);*/
       // bst.inorderTravesal();

       // System.out.println("ROOT ele "+bst.root);
        //System.out.println("Height "+bst.height());
        System.out.println("Before swap");
        bst.printDirectoryStructuredTree();
     //   bst.swapTree();
        bst.DFS();
        System.out.println("After swap");

        bst.printDirectoryStructuredTree();
    }

}

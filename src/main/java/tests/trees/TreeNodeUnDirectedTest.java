package tests.trees;

import org.junit.Before;
import org.junit.Test;
import trees.TreeNodeUnDirected;
import trees.TreeUtil;

import java.util.ArrayList;

/**
 * Created by saurabh on 5/7/18.
 */
public class TreeNodeUnDirectedTest {

    TreeNodeUnDirected root;
    TreeUtil treeUtil=new TreeUtil();
    @Before
    public void prepare(){

        root=new TreeNodeUnDirected();
        root.setVal(0);
        ArrayList<TreeNodeUnDirected> rootCh=new ArrayList<>();
        root.setLinks(rootCh);
        TreeNodeUnDirected node1=new TreeNodeUnDirected();
        node1.setVal(1);
        rootCh.add(node1);
        TreeNodeUnDirected node2=new TreeNodeUnDirected();
        node2.setVal(2);
        rootCh.add(node2);
        ArrayList<TreeNodeUnDirected> node2Ch=new ArrayList<>();
        node2.setLinks(node2Ch);

        TreeNodeUnDirected node3=new TreeNodeUnDirected();
        node3.setVal(3);

        TreeNodeUnDirected node4=new TreeNodeUnDirected();
        node4.setVal(4);
        TreeNodeUnDirected node5=new TreeNodeUnDirected();
        node5.setVal(5);
        node2Ch.add(node3);
        node2Ch.add(node4);
        node2Ch.add(node5);

    }

    @Test
    public void testDispaly(){

        TreeUtil.dispalyTreePreOder(root);

    }





}

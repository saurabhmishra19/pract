package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saurabh on 5/7/18.
 */
public class TreeNodeUnDirected {

    int val;

    private List<TreeNodeUnDirected> links=new ArrayList<>();


    public int getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "TreeNodeUnDirected{" +
                "val=" + val +
                ", links=" + links +
                '}';
    }

    public void setVal(int val) {
        this.val = val;
    }

    public List<TreeNodeUnDirected> getLinks() {
        return links;
    }

    public void setLinks(List<TreeNodeUnDirected> links) {
        this.links = links;
    }
}

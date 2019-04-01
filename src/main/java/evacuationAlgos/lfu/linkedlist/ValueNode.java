package evacuationAlgos.lfu.linkedlist;

/**
 * Created by saurabh on 28/9/18.
 */
public class ValueNode {
    int key;
    int val;
    FrequencyNode fNode;
    Data dNode;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public FrequencyNode getfNode() {
        return fNode;
    }

    public void setfNode(FrequencyNode fNode) {
        this.fNode = fNode;
    }

    public Data getdNode() {
        return dNode;
    }

    public void setdNode(Data dNode) {
        this.dNode = dNode;
    }
}

package evacuationAlgos.lfu.linkedlist;

/**
 * Created by saurabh on 28/9/18.
 */
public class Data extends Node{
    private int key;
    private int val;

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

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", val=" + val +
                '}';
    }
}

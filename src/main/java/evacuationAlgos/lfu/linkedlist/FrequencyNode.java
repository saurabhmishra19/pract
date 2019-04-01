package evacuationAlgos.lfu.linkedlist;

/**
 * Created by saurabh on 28/9/18.
 */
public class FrequencyNode extends Node{

    private int key;
    private int count;
    private LinkedListI listItems = new LinkedListImpl();

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LinkedListI getListItems() {
        return listItems;
    }

    public void setListItems(LinkedListI listItems) {
        this.listItems = listItems;
    }
}

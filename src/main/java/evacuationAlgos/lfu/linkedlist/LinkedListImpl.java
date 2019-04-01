package evacuationAlgos.lfu.linkedlist;

/**
 * Created by saurabh on 28/9/18.
 */
public class LinkedListImpl implements LinkedListI {

    private Node start, end;
    private int size;

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void add(Node n) {

        if(start==null ){
            start=n;
            end=n;
            size=1;
        }else{
            end.setNext(n);
            n.setPrevious(end);
            end=n;
            size++;
        }

    }

    @Override
    public void delete(Node n) {

        if(n.getPrevious()==null){
            if(n.getNext()==null){
                start=null;
                end=null;
                size=0;
            }
            else{
                start=n.getNext();
                n.setPrevious(null);
                size--;
            }


        }

    }

    @Override
    public Node get(Node n) {
        return null;
    }
}

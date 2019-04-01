package evacuationAlgos.lfu.linkedlist;

/**
 * Created by saurabh on 28/9/18.
 */
public abstract class Node {

   private Node next,previous;


    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }



}

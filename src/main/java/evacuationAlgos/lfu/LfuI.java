package evacuationAlgos.lfu;

/**
 * Created by saurabh on 27/9/18.
 */
public interface LfuI {

    void put(int key, int val);
    int get(int key);
    void print();
    void delete(int key);



}

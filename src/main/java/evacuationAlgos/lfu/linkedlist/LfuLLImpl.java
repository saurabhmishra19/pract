package evacuationAlgos.lfu.linkedlist;

import evacuationAlgos.lfu.LfuI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by saurabh on 28/9/18.
 */
public class LfuLLImpl implements LfuI {


    private Map<Integer, ValueNode> values=new HashMap<>();
    private LinkedListImpl frequenciesLL=new LinkedListImpl();


    private int maxCap=200;
    private int currentCap;
    LfuLLImpl(){}
    LfuLLImpl(int maxCap){this.maxCap=maxCap;}




    @Override
    public void put(int key, int val) {
        if(!values.containsKey(key)){
            FrequencyNode f=(FrequencyNode)frequenciesLL.getStart();
            Data d=new Data();
            d.setKey(key);
            d.setVal(val);
            if(f.getKey()==1)
            {

                f.getListItems().add(d);
            }else{


            }

        }



    }

    @Override
    public int get(int key) {
        return 0;
    }

    @Override
    public void print() {

    }

    @Override
    public void delete(int key) {

    }
}

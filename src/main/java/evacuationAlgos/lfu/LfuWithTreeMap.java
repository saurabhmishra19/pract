package evacuationAlgos.lfu;

import java.util.*;

/**
 * Created by saurabh on 27/9/18.
 */
public class LfuWithTreeMap implements LfuI{

    private Map<Integer, Integer> values=new HashMap<>();
    private Map<Integer, Integer> counts=new HashMap<>();
    private TreeMap<Integer,List<Integer>> frequencies=new TreeMap<>();
    private int maxCap=200;
    private int currentCap;
    LfuWithTreeMap(){}
    LfuWithTreeMap(int maxCap){this.maxCap=maxCap;}



    @Override
    public synchronized void put(int key, int val) {

        if(!values.containsKey(key)){
            if(!(currentCap<maxCap)){
                delete();

            }
            values.put(key,val);
            counts.put(key,1);
            frequencies.
                    computeIfAbsent(1,v->{return new ArrayList<>();}).add(key);
            currentCap++;
            System.out.println("key "+key+" val "+val);
            System.out.println(frequencies);
        }


    }
    public synchronized void delete(){

        if(frequencies.firstEntry()!=null &&
                !frequencies.firstEntry().getValue().isEmpty()){
            int val=frequencies.firstEntry().getValue().remove(0);
            values.remove(val);
            counts.remove(val);
            if(frequencies.firstEntry().getValue().isEmpty())
                frequencies.pollFirstEntry();
        }

    }

    @Override
    public synchronized int get(int key) {
        if(values.containsKey(key)){
            //update frequency
            int freq=counts.get(key);
            if(frequencies.get(freq).contains(key)){
                frequencies.get(freq).remove( frequencies.get(freq).indexOf(key));
                if(frequencies.get(freq).isEmpty())
                    frequencies.remove(freq);
                freq++;
                counts.put(key,freq);
                frequencies.computeIfAbsent(freq,k->new ArrayList<>()).add(key);

            }
            System.out.println("frequencies:: "+frequencies);




            return values.get(key);
        }else{
            return -1;
        }
    }

    @Override
    public void print() {
      values.forEach(
              (k,v)->{
                  int freq=counts.get(k);
                  System.out.println("key "+k+" v "+v+" freq "+freq);
                  frequencies.get(freq).get(k);

              }


      );
    }

    @Override
    public void delete(int key) {

    }
}

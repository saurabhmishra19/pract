package evacuationAlgos.lfu;

import java.util.Random;

/**
 * Created by saurabh on 27/9/18.
 */
public class LfuTest {

    public static  void main(String [] args){
        LfuWithTreeMap lfu=new LfuWithTreeMap(3);
        int max=10;
        Random rnd=new Random(200);

        for(int k=0;k<max;k++){

            int key=rnd.nextInt(10);
            int val=rnd.nextInt(20);
            lfu.put(key,val);
           System.out.println(lfu.get(key));


        }


//lfu.print();

    }


}

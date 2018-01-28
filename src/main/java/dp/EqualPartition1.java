package dp;

import java.util.*;

/**
 * Created by saurabh on 28/1/18.
 */
public class EqualPartition1 {

    public static void main(String [] args){
        int [] nums=new int []  {4,15,1,1,1,1,3,11,1,10};
        System.out.print(isPossibleToDivide(nums,3));


    }
    public static boolean isPossibleToDivide(int [] nums , int k){

        Arrays.sort(nums);

        List<ArrayList<Integer>> all=new ArrayList<ArrayList<Integer>>(k);


        for(int i =nums.length-1;i>nums.length-1-k;i--){
            ArrayList<Integer> values=new ArrayList<Integer>();
            values.add(nums[i]);
            all.add(values);

        }
        System.out.println(all);


        int each=(nums.length-k)/k;
        int mod=(nums.length-k)%k;

         Collections.reverse(all);
        ListIterator<ArrayList<Integer>> itr=all.listIterator();
        for(int i=nums.length-k-1;i>=0;i--){
            System.out.println(nums[i]);

            if(itr.hasNext())
            {
                ArrayList<Integer> val=itr.next();
                val.add(nums[i]);

                System.out.println(" adding nums in "+nums[i]+" val "+val);

                if(!itr.hasNext()){

                    int sum=0;
                    for(int t:val){
                        sum+=t;
                    }
                }


            }else{
                itr=all.listIterator();

                ArrayList<Integer> val=itr.next();
                val.add(nums[i]);
                System.out.println(" adding nums in else "+nums[i]+" val  "+val);
            }

        }
        System.out.println(all);
        itr=all.listIterator();

        int sumOld=0;
        boolean first=true;
        while(itr.hasNext()){
            ArrayList<Integer> sol=itr.next();
            int sum=0;
            for(int t:sol){
                sum+=t;
            }
            if(first){
                first=false;
                sumOld=sum;
            }else{
                if(sum!=sumOld)
                    return false;
            }


        }
        return true;
    }


}

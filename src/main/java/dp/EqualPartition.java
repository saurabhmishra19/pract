package dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by saurabh on 28/1/18.
 */
public class EqualPartition {


    public static void main(String [] args){

        int [] nums=new int [] //{4,3,2,3,5,2,1};
                {1,1,1,1,1,1,1,1,1,1};
        System.out.print(isPossibleToDivide(nums,5));

    }

    public static boolean isPossibleToDivide(int [] nums, int k){
        ArrayList<Integer> values=new ArrayList<Integer>(nums.length);
        int maxValue=findMax(nums,values);
        List<HashSet<Integer>> combinations=new ArrayList<HashSet<Integer>>();

            for(int i=0;i<values.size();i++){
                int tmpSum=values.get(i);
                HashSet<Integer> sum=new HashSet<Integer>();
                sum.add(tmpSum);
                for(int j=i+1;j<values.size();j++){

                    if(tmpSum+values.get(j)==maxValue){
                        sum.add(values.get(j));
                        combinations.add(sum);
                        break;
                    }
                    else if(tmpSum+values.get(j)<maxValue){
                        sum.add(values.get(j));
                        values.remove(j);
                    }
                }
            }
            System.out.println(combinations);
            return combinations.size()==k;
    }

    public static int findMax(int [] nums,ArrayList<Integer> values ){
        int max=nums[0];
        for(int i=1;i<nums.length ;i++){
            int k=nums[i];

            if(max<k) {
                values.add(max);
                max = k;
            }else
                values.add(k);

        }
        return max;
    }



}

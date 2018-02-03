package dp;

/**
 * Created by saurabh on 3/2/18.
 */
public class RobberyPlanner {


    public static void main(String [] args){

        int [] nums=new int [] {2,3,4,1,7,9,11};


    }
    public static int maxAmountRobb(int [] nums){
        int odd=0,even=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-3){

            }

            else if(i%2==0)
                even+=nums[i];
            else
                odd+=nums[i];
        }
        return odd>even?odd:even;
    }






}

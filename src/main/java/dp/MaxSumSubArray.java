package dp;

import java.util.Arrays;

/**
 * Created by saurabh on 2/2/18.
 */
public class MaxSumSubArray {

    public static void main(String[] args) {


        int[] in = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int [] sum=new int [in.length];

        int max=Integer.MIN_VALUE;
        int initial=0;
        for (int i = 0; i < in.length; i++) {
            initial+=in[i];
            max=Math.max(maxSubArray(in, i,sum,i==0,initial),max);
        }
        System.out.println(max);
        System.out.println(maxSumArray(in));
    }

    public static int maxSumArray(int [] nums){
        int maxCurr=nums[0];
        int max=nums[0];


        for(int i=1;i<nums.length;i++){
            int val=nums[i];

            if(val+maxCurr>0){
                System.out.println(maxCurr+" val "+val);
                maxCurr=val+maxCurr;
            }
            else if(val>maxCurr)
                maxCurr=val;

            if(maxCurr>max)
                max=maxCurr;
        }
        return max;


    }



    public static int maxSubArray(int[] nums, int i,int [] sum,boolean fill, int till) {
        int maxtill = Integer.MIN_VALUE;
        int tmpSum = 0;
        while (i < nums.length) {
            tmpSum += nums[i];
            if(fill)
                sum[i]=tmpSum;

            if (tmpSum > maxtill) {
                maxtill = tmpSum;
            }
            i++;
        }
        return maxtill;
    }


}

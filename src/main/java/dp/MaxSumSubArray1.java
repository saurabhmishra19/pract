package dp;

/**
 * Created by saurabh on 17/3/18.
 */
public class MaxSumSubArray1 {


    public static void main(String[] args) {
        int[] in = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        int maxCurr = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < in.length; i++) {
            if (currSum+in[i] < in[i])
                currSum = in[i];
            else
                currSum += in[i];
            if (currSum > maxCurr)
                maxCurr = currSum;
        }
        System.out.println(maxCurr);

    }


}

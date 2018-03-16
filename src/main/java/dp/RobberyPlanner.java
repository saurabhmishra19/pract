package dp;

/**
 * Created by saurabh on 3/2/18.
 */
public class RobberyPlanner {


    public static void main(String [] args){

        int [] nums=new int [] {6,3,10,8,2,10,3,5,10,5,3};
        System.out.println(maxValue(nums));

    }

    public static int maxValue(int [] arr){
        if(arr.length==0)
            return 0;
        int [] sol=new int [arr.length] ;
        int maxVal=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxVal= Math.max(robber(arr,i,sol),maxVal);

        }

        return maxVal;
    }

    public static int robber(int [] arr, int i, int [] sol){
        int solAll=arr[i];
        if(i<arr.length){
            for(int j=i+2;j<arr.length;j++){
                solAll=Math.max(rob(arr,i,j)+arr[i],solAll);
            }



        }
        return solAll;

    }


    public static int rob(int [] arr, int i,int j){
        int val=0;
        if(j<arr.length){
            val+=rob(arr,i,j+2)+arr[j];
        }
        return val;
    }










}

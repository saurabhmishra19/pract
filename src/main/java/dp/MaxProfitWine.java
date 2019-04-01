package dp;

/**
 * Created by saurabh on 23/1/19.
 */
public class MaxProfitWine {


    public static void main(String [] args){

        int [] winesPrice=new int []{1,4,2,3};
        System.out.println(bestPrice(winesPrice));

    }

    public static int bestPrice(int [] wines){



        return 0;//Math.max(bestP(wines,0,1, 0),bestP(wines,wines.length-1,1,1));

    }









}

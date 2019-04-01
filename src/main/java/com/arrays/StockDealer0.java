package com.arrays;

/**
 * Created by saurabh on 26/5/18.
 */
public class StockDealer0 {

    public static void main(String [] args){
        int [] arr=new int []{7,6,4,3,1};
        StockDealer0 sdl=new StockDealer0();
        System.out.println(sdl.maxProfit(arr));

    }

    public int maxProfitN(int [] prices){
        int min=prices[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-min>0){
                max=prices[i];

            }else {

                if(prices[i]<min){
                   // min=
                }
            }


        }

        return 0;
    }



    public int maxProfit(int[] prices) {

        return buy(prices);
    }

    public int buy(int [] prices){
        int maxValue=0;
        int prev=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<=prev) {
                prev=prices[i];
                maxValue = Math.max(sell(prices, i, i + 1), maxValue);
            }
        }
        return maxValue;
    }

    public int sell(int [] price, int bought, int j){

        int max=0;
        if(j<price.length){
            max=Math.max((price[j]-price[bought]), sell(price, bought,j+1));
        }
        return max;

    }


}

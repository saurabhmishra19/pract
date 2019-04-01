package com.arrays;

/**
 * Created by saurabh on 23/5/18.
 */
public class StockDealer {


    public static void main(String [] args){
        int [] input=new int[]{6,1,3,2,4,7};
        StockDealer sd=new StockDealer();
        System.out.println(sd.maxProfit(input));


    }


    public int maxProfit(int[] prices) {
       int max=0;
        int [] cal=new int [prices.length];
        //for(int i=0;i<prices.length;i++){
        int i=0;
            max=Math.max(sellCombination(i,i+1,prices, cal),max);

      //  }

        return max;
    }


    public int sellCombination(int i, int j, int [] prices, int [] cal){
        int maxSelling=0;
        while(j<prices.length){
            maxSelling=Math.max(maxSelling,sellThatOrder(i,j,prices, cal));
            j++;
        }
        return maxSelling;
    }

    public int sellThatOrder(int i, int j, int [] price, int [] cal){
        int priceCal=0;
        if(j<price.length) {
            if(cal[i]!=0)
            return cal[i];
            if (price[j] - price[i] > 0) {
                priceCal+=(price[j]-price[i])+Math.max(sellThatOrder(j, j+1,price, cal),sellThatOrder(j+1, j+2,price, cal));

            }
            else{
                priceCal+=sellThatOrder(j, j+1,price, cal);
            }
            cal[i]=priceCal;
        }

        return priceCal;
    }





    public int bestCombination(int i,int j, int [] prices){
        int best=0;
        if(j<prices.length){
            for(int k=j;k<prices.length;k++){
                best=Math.max(prices[k]-prices[i]+ bestCombination(k+1, k+2, prices),best);

            }

        }
        return best;
    }


}

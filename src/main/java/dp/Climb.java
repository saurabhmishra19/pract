package dp;

import java.util.ArrayList;

/**
 * Created by saurabh on 3/2/18.
 */
public class Climb {

    public static void main(String [] args){
        int n=4;
        System.out.println("number "+combinations(n));

    }

    public static int combinations(int n){
        ArrayList<Integer> all=new ArrayList<>();
        all.add(0);
        combination(0,n,0,all);
        System.out.println("all "+all.get(0));
        return 0;

    }

    public static int combination(int i, int n, int sum,ArrayList<Integer> all){
        System.out.println(">> "+i+" sum "+sum);
        int count=0;
        if(sum<n){
            System.out.println("sum "+sum);
            count+=combination(i+1, n, sum+1,all);
            count+=combination(i+1, n, sum+2,all);
        }else if (sum==n){
            all.set(0,all.get(0)+1) ;
        }


        return count;

    }





}

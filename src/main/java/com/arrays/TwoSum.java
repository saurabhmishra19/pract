package com.arrays;

import java.util.Arrays;

/**
 * Created by saurabh on 26/5/18.
 */
public class TwoSum {
    public static void main(String [] args){
        TwoSum sum=new TwoSum();
        int [] arr=new int [] {5,25,75};
        System.out.println(Arrays.toString(sum.twoSumPoi(arr, 100)));
    }

    public int [] twoSumPoi(int [] numbers, int target){
        int [] arr=new int [2];
        int i=0,j=1;

        if(numbers.length>1){
            while(i<j && j<numbers.length && i>=0){
                int sum=numbers[i]+numbers[j];
                if(sum==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
                else if(sum<target){
                    i++;
                    j++;
                }

                else {
                    i--;
                }

            }


        }

        return arr;
    }


    public int[] twoSum(int[] numbers, int target) {
        int [] arr=new int [2];
        int diff=0;
        for(int i=0, j=1;i<numbers.length && j<numbers.length;i++){
            if(target<numbers[i] && diff<numbers[i]){
                if(numbers[i]+numbers[j]== target){
                    arr[0]=i;
                    arr[1]=j;
                }else if(numbers[i]+numbers[j]> target){
                    break;
                }else{
                    j++;
                }

            }else{

                break;
            }

        }


        return arr;
    }

}

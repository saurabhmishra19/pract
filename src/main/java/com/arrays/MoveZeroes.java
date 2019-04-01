package com.arrays;

import java.util.Arrays;

/**
 * Created by saurabh on 20/5/18.
 */
public class MoveZeroes {


    public static void main(String [] args){

        int [] arr=new int [] {1,0,1};
        System.out.println(Arrays.toString(arr));
        moveArr1(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZero(int [] arr){

        for(int i=0,j=1;j<arr.length;){
            if(arr[i]==0){
            }

            if(arr[j]==0){
                j++;


            }

        }

    }



    public static void moveArr1(int [] nums){
        if(nums.length>1) {
            int i=0, j=1;
            while(j<nums.length){

                if(nums[i]==0 && nums[j]!=0){

                    nums[i]=nums[j];
                    nums[j]=0;
                    i++;j++;
                }else {
                    if (nums [i]!=0 ){
                        i++;
                    }
                    j++;
                }



            }




        }

    }



}

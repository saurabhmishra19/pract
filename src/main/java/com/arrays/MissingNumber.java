package com.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saurabh on 21/5/18.
 */
public class MissingNumber {

    public static void main(String [] args){
int [] arr=new int [] {4,3,2,7,8,2,3,1};
        System.out.println(findNums(arr));

    }

    public static List<Integer> findNums(int [] nums) {
        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

           int val=Math.abs(
                   nums[i]);
            val=val-1;
           if(nums[val]>0)
           nums[val]=nums[val]*-1;


        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                values.add(i+1);
        }
        return values;
    }
    }



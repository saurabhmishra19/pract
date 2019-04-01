package com.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by saurabh on 23/5/18.
 */
public class MajorityEle {

    public static void main(String [] args){
        int [] arr=new int [] {2,2,1,1,1,2,2};

        System.out.println(majorityElement1(arr));
    }


    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> mapVal=new HashMap<>();
        int maxVal=0;
        int maxCount=0;
        for(int k: nums){
            int mapMax=0;
            if(mapVal.containsKey(k)){
                mapMax =mapVal.get(k);

            }
            mapMax+=1;
            if((mapMax)>maxCount) {
                maxCount = mapMax;
                maxVal=k;
            }
            mapVal.put(k,mapMax);


        }
        return maxVal;
    }



    public static int majorityElement1(int[] nums) {
        int maj=nums[0];
        int count =1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                maj=nums[i];
                count++;
            }
            else if(maj==nums[i]){
                count++;


            }else{
                count--;
            }
        }


        return maj;

    }




}

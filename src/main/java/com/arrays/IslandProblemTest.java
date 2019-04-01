package com.arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by saurabh on 17/5/18.
 */

public class IslandProblemTest {

    private IslandProblem island;
    private int[][] arr;
    private int [][] sampler;

    @Before
    public void setup() {
        island = new IslandProblem();
        this.arr = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        this.sampler = new int[][]{
                {1, 0, 1},
                {1, 1, 1},
                {0, 0, 1}};
    }


    @Test
    public void testInit() {
       // int count = island.maxCounter(arr);
     //   System.out.println(count);
     //   assertThat("should be 13 but resulting as "+count, 13,is(equalTo(count)));


    }
    @Test
    public void testSampler(){

        int countSam=island.maxArea(this.arr);
        System.out.println("I am sampler"+countSam);

    }



    @After
    public void tearDown() {

        // nothing as such

    }


}

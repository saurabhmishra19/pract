package com.arrays;

/**
 * Created by saurabh on 17/5/18.
 */
public class IslandProblem {


    public static void main(String[] args) {

        int[][] arr = new int[][]{


                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}

        };
        int[][] sampler = new int[][]{
                {1, 0, 1},
                {1, 1, 1},
                {0, 0, 1}};


        IslandProblem is = new IslandProblem();

        int i = is.getIsland(false, false, 0, 0, sampler);
        System.out.println(i);

    }

    public int maxCounter(int[][] arr) {

        int i = arr.length;
        int j = 0;
        if (null != arr[0]) {
            j = arr[0].length;
        }
        int count = 0;
        int maxCount = 0;
        for (int m = 0; m < i; m++) {


            for (int n = 0; n < j; n++) {

                maxCount = Math.max(getIsland(false, false, m, n, arr), maxCount);


            }

        }


        return maxCount;
    }

    public int getIsland(int i, int j, int[][] arr) {
        System.out.println("i> " + i + " j>" + j);
        if (arr[i][j] == 1) {
            int l = 0;
            if (j + 1 < arr[0].length)
                l = 1 + getIsland(i, j + 1, arr);
            int k = 0;
            if (i + 1 < arr.length)
                k = 1 + getIsland(i + 1, j, arr);


            return k + l;
        }

        return 0;
    }

    //{1, 0, 1},
//{1, 1, 1},
    //  {0, 0, 1}
    public int getIsland(boolean top, boolean left, int i, int j, int[][] arr) {
        int p = arr.length;
        int q = arr[0].length;
        int a = 0;

        // System.out.println(left +" top "+top+" i "+i+" j "+j+" val "+arr[i][j] );

        if (!(top && arr[i][j] == 1 && ( j<p && i<q && arr[j][i] == 1) && i != j) && arr[i][j] == 1 && arr[i][j] != -1) {
            arr[i][j] = -1;

            a = a + 1;
        }
        if (j + 1 < q) {
            a += getIsland(false, true, i, j + 1, arr);

        }
        if (i + 1 < p) {
            a += getIsland(true, false, i + 1, j, arr);
        }

        return a;


    }
    public int maxArea(int [][] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){

                if(arr[i][j]==1){
                    max=Math.max(max, maxArea(i,j,arr));
                }

            }
        }
        return max;
    }

    public int maxArea(int i, int j , int [][] arr){

        if(i<0 || i>arr.length-1 || j<0 || j>arr[0].length-1 || arr[i][j]!=1){
            return 0;
        }
        arr[i][j]=-1;
        return 1+maxArea(i+1,j, arr)+maxArea(i-1,j,arr)+maxArea(i,j+1,arr)+maxArea(i,j-1,arr);


    }





}

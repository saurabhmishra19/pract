package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> values=new ArrayList<Integer>(m*n);
        System.out.println(m+" "+n);

        for (int i=0;i<m;i++){
            int a=i;
            int b=i;
            for(;a<n-i;a++){
                values.add(matrix[b][a]);
                System.out.println(matrix[b][a]);
            }
            a=a-1;
            b=b+1;
            for(;b<m-i;b++){
                values.add(matrix[b][a]);
            }
            b=b-1;
            int c=n-i-2;
            for(;c>=i;c--){
                values.add(matrix[b][c]);
            }
           c=c+1;
            for(int d=m-i-2;d>i;d--){
                values.add(matrix[d][c]);
           }


        }


return null;


    }

    public static void main(String[] args) {
        int[][] values = new int[][]

                {
                        {1, 2, 3},
                        {4, 5, 6},
                       // {7, 8, 9},
                       // {10, 11, 12}
                };

        spiralOrder(values);
    }

}





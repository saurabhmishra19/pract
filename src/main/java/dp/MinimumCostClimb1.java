package dp;

/**
 * Created by saurabh on 17/3/18.
 */
public class MinimumCostClimb1 {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        int minCost = 0;
        System.out.println(move(arr));

    }

    public static int move(int[] arr) {

        int l = move(arr, 0, 1);
        int r = move(arr, 1, 2);

        return l < r ? l : r;
    }

    public static int move(int[] arr, int i, int j) {
        int valL = 0;
        int valR = 0;
        if (j < arr.length) {
            valL += move(arr, i + 1, i + 2) + arr[i];
            if (j + 2 < arr.length)
                valR += move(arr, j + 1, j + 2) + arr[j];
            else
                valR += arr[j];
            return Math.min(valL, valR);

        } else
            return Math.min(valL, valR);
    }
}




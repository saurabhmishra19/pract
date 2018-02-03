package dp;

/**
 * Created by saurabh on 3/2/18.
 */
public class Climb {

    public static void main(String [] args){
        int n=3;
        System.out.println("number "+combinations(n));

    }

    public static int combinations(int n){

        combination(0,n,0);

        return 0;
    }

    public static int combination(int i, int n, int sum){
        System.out.println(">> "+i+" sum "+sum);
        if(sum<n) {
            combination(i + 1, n, sum + 1);
            combination(i + 2, n, sum + 2);
            i++;
        }

        return 0;

    }





}

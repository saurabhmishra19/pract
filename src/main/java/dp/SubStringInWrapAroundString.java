package dp;

import java.util.ArrayList;

/**
 * Created by saurabh on 29/1/18.
 */
public class SubStringInWrapAroundString {

    public static void main(String[] args) {


        String input = "cac";
        ArrayList<String> values=new ArrayList<String>();
        System.out.print(allPossibleCobmbinations(input, values));
    }

    public static int allPossibleCobmbinations(String input, ArrayList<String> values) {
        char[] ch = input.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            count += allcombo("", i, ch, values);
        }
        count = count;
        System.out.println("count " + count);

        return 0;

    }

    public static int allcombo(String in, int j, char[] sh, ArrayList<String> values) {
        int count = 0;
        if (j < sh.length) {


            String s = in + sh[j];
            if (isSub(s)) {
                if(!values.contains(s)) {
                    values.add(s);
                    count = count + allcombo(s, j + 1, sh, values) + 1;
                }
                else
                    count = count + allcombo(s, j + 1, sh, values) + 0;
            }


        }
        return count;

    }


    public static boolean isSub(String in) {

        String s="zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd";

        return s.contains(in);
    }


}

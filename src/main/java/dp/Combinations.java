package dp;

/**
 * Created by saurabh on 17/3/18.
 */
public class Combinations {

    public static void main(String[] args) {
        String a = "xyz";
        String b = "abc";
        allCombination(a.toCharArray(), b.toCharArray());
        allCombination(b.toCharArray(), a.toCharArray());

    }

    public static void allCombination(char[] ch, char[] ch1) {


        int i = 0;

        for (; i < ch.length; i++) {

            allCombination(ch, ch1, i);
        }

    }

    public static void allCombination(char[] ch, char[] ch1, int i) {

        int j = 0;
        StringBuffer buffer = new
                StringBuffer();
        buffer.append(ch[i]);
        while (j < ch1.length) {
            buffer.append(ch1[j]);
            System.out.println(buffer.toString());
            j++;
        }


    }


}

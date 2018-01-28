package dp;

import java.util.ArrayList;

/**
 * Created by saurabh on 29/1/18.
 */
public class SubStringInWrapAroundString {

    public static void main(String [] args){


        String input="zab";
        System.out.print(allPossibleCobmbinations(input));




    }


    public static int findSubstringInWraproundString(String p) {

        return 0;
    }

    public static ArrayList<String> allPossibleCobmbinations(String input){
        char [] ch=input.toCharArray();
        ArrayList<String> allPossible=new ArrayList<String>();
        int i=0;
        for(;i<ch.length-2;i++){
            allPossible.add(ch[i]+"");
            allcombination(allPossible, ch,i++,ch[i]+"");
        }
        allPossible.add(ch[i]+"");




        return allPossible;

    }

    public static void allcombination(ArrayList<String> allcom, char [] ch, int start, String intial){
        if(start<ch.length-1)
        allcombination(allcom, ch,start++, intial+ch[start]);

    }



}

package dp;

public class Paranthesis {


    public static void main(String[] args) {
        String input = "()()";
        maxCount(input.toCharArray());

    }

    public static int maxCount(char [] ch){
        for(int i=0;i<ch.length;i++){

            maxCount(ch, i,"");

        }

        return 0;
    }

    public static int maxCount (char [] ch, int i, String sub){
        int t=0;

        if(i<ch.length){
            sub+=""+ch[i];
            System.out.println(sub);
            maxCount(ch, ++i, sub);
        }


        return 0;
    }


    public static boolean isBalanced(String sub){
        boolean isBal=true;
        char [] ch=sub.toCharArray();
        if(sub.length()>0 && sub.length()%2==0){
            for(int i=0,k=ch.length-1;i<k;i++,k--){
                if(ch[i]=='(' && ch[k]!=')' || ch[i]=='[' && ch [k]!=']' || ch[i]=='{' && ch[k]!='}'){
                    isBal=false;
                }

            }
        }
        return isBal;
    }








}

package problems;

/**
 * Created by saurabh on 11/2/18.
 */
public class UniqueArray {

    public static void main(String [] args){

        int [] arr=new int [] {2,2,1,3,3,4,4};
        System.out.println(findNonduplicate(arr));

    }

    public static int findNonduplicate(int [] arr){
        int tmp=0;
        for(int i:arr){

            tmp^=i;

        }
        return tmp;
    }




}

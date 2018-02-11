package problems;

import java.util.Stack;

/**
 * Created by saurabh on 11/2/18.
 */
public class ReverseStackWithoutExtraMemo {

    public static void main(String[] args) {


        ReverseStackWithoutExtraMemo st = new ReverseStackWithoutExtraMemo();
        int[] input = new int[]{7, 3, 2, 8, 11, 9};
        for (int i : input)
            st.push(i);
        st.display();
        st.insertAtBottom(23);
        st.display();
        st.reverse(0);
        st.display();

    }

    private Stack<Integer> input = new Stack<>();

    public void display(){
        System.out.println(">> "+input);
    }
    public void push(int val) {
        this.input.push(val);
    }

    public int pop() {
        return this.input.isEmpty() ? -1 : this.input.pop();
    }

    public void insertAtBottom(int val) {
        int valTmp = 0;
        if (
                !input.isEmpty()) {

            valTmp = input.pop();
            insertAtBottom(val);
        }
        if (input.isEmpty())
            input.push(val);
        else
            input.push(valTmp);
    }

    public void reverse(int i){

        if( i<input.size()){
            int tmp=input.pop();

            System.out.println(tmp);
            i=i+1;
          //  System.out.println(i);

            reverse(i);
            insertAtBottom(tmp);
        }

    }



}

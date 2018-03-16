package problems;

import java.util.Stack;

/**
 * Created by saurabh on 12/2/18.
 */
public class StackWithMaxFunc {

    public static void main(String[] args) {

        StackWithMaxFunc st = new StackWithMaxFunc();
        int[] input = new int[]{7, 3, 2, 8, 11, 9};
        for (int i : input)
            st.push(i);

        System.out.println(st.getMax());


    }

    private Stack<Integer> input = new Stack<>();
    private Stack<Integer> maxVal = new Stack<>();

    public void push(int in) {
        this.input.push(in);
        if (maxVal.isEmpty() || maxVal.peek() <= in) {
            maxVal.push(in);
        }
    }

    public int pop() {
        if (input.isEmpty())
            return -1;
        int val = this.input.pop();
        if (maxVal.peek() == val) {
            maxVal.pop();
        }
        return val;
    }

    public int getMax() {

        return this.maxVal.isEmpty()?-1:this.maxVal.peek();
    }


}

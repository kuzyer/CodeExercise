import java.util.Stack;

//最小栈
public class test155 {
    private Stack<Integer> data;
    private Stack<Integer> minValue;

    /** initialize your data structure here. */
    public test155() {
        data = new Stack<>();
        minValue = new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        if (minValue.isEmpty() || x <= minValue.peek()) {
            minValue.push(x);
        }
    }

    public void pop() {
        int value = data.pop();
        if (value == minValue.peek()) {
            minValue.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return minValue.peek();
    }
}

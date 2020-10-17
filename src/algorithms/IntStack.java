package algorithms;

public class IntStack {
    private int[] stack;
    private int top;
    private int size;

    public IntStack() {
        top= -1;
        size = 50;
        stack = new int [size];
    }

    public boolean push(int item) {
        if(!isFull()) {
            top++;
             stack[top] = item;
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return (top == stack.length -1);
    }

    public int pop() {
        return stack[top--];
    }
}

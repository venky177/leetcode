/*Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
*/

import java.util.Objects;
import java.util.Stack;

public class MinStack155 {

    Stack<Integer> nums;
    Stack<Integer> min;

    /** initialize your data structure here. */
    public MinStack155() {

        min = new Stack<>();
        nums = new Stack<>();

    }

    public void push(int x) {
        nums.push(x);
        if(min.isEmpty()){
            min.push(x);
        }
        else if(x<=min.peek())min.push(x);



    }

    public void pop() {

        if(Objects.equals(nums.peek(), min.peek()))min.pop();
        nums.pop();

    }

    public int top() {
return nums.peek();
    }

    public int getMin() {
return min.peek();
    }

    public static void main(String args[]){

        MinStack155 m = new MinStack155();
        m.push(512);
        m.push(-1024);
        m.push(-1024);
        m.push(512);
        m.pop();
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.getMin());

    }

}

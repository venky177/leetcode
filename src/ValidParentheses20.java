import java.util.Stack;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.


 */
public class ValidParentheses20 {

public static void main(String args[]){
    Stack<Character> stk = new Stack<>();

    String s = "((";

    char arr[] = s.toCharArray();

    stk.push(arr[0]);
    int i=1;
    boolean flag = true;
    while (!stk.isEmpty()){
        if(i>=arr.length){
            flag = false;
            break;
        }

        if(arr[i]=='}'){
            if(!stk.peek().equals('{')){
                flag = false;
                break;
            }
            stk.pop();
        }

        else if(arr[i]==')'){
            if(!stk.peek().equals('(')){
                flag = false;
                break;
            }
            stk.pop();
        }

        else if(arr[i]==']'){
            if(!stk.peek().equals('[')){
                flag = false;
                break;
            }
            stk.pop();
        }
        else stk.push(arr[i]);
        i++;
    }



}

}

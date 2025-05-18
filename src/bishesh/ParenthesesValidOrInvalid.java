package src.bishesh;
import java.util.Stack;
public class ParenthesesValidOrInvalid {
    public static void main(String[] args) {
        String s="([]{}";
        result(s);
        System.out.print(result(s)+" ");
    }
    public static boolean result(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top=stack.pop();
                if(!isMatching(top,ch)){
                    return false;
                }
            }
        }
    return stack.isEmpty();
    }
    public static boolean isMatching(char c1,char c2){
        return ((c1=='[' && c2==']') ||
                c1=='{' && c2=='}'||
                c1=='(' && c2==')');
    }
}

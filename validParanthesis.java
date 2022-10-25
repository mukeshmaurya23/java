import java.util.Stack;

public class validParanthesis {
    public String isValid(String s) {
        Stack<Character> stk = new Stack<Character>();

        if (s.length() % 2 == 1) {
            return "String is not valid";
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stk.push(s.charAt(i));

            } else if (s.charAt(i) == ')' && !stk.isEmpty() && stk.peek() == '(') {
                stk.pop();
            } else if (s.charAt(i) == ']' && !stk.isEmpty() && stk.peek() == '[') {
                stk.pop();
            } else if (s.charAt(i) == '}' && !stk.isEmpty() && stk.peek() == '{') {
                stk.pop();
            } else {
                return "String is not valid";
            }
        }
        return "String is valid";
    }

    public static void main(String[] args) {
        String s = "{{}}()[()";
        validParanthesis obj = new validParanthesis();
        System.out.println(obj.isValid(s));

    }
}

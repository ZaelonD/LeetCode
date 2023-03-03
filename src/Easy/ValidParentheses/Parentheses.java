package Easy.ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Parentheses {

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch))
                stack.push(ch);
            else{
                char top = stack.isEmpty() ? '?' : stack.pop();
                if (top != map.get(ch))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}

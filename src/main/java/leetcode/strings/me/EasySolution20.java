package leetcode.strings.me;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by shamil.valiev on 5/15/2018.
 */
public class EasySolution20 {

    public boolean isValid(String s) {
        if (s == null) return false;
        Deque<Character> stack = new ArrayDeque<>();
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char k = stack.pop();
                if ((c == ')' && k != '(') || (c == ']' && k != '[') || (c == '}' && k != '{'))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        EasySolution20 solution20 = new EasySolution20();
        System.out.println(solution20.isValid("()"));
        System.out.println(solution20.isValid("(}"));
        System.out.println(solution20.isValid("("));
        System.out.println(solution20.isValid(""));
        System.out.println(solution20.isValid("({})"));
        System.out.println(solution20.isValid("({])"));
    }
}

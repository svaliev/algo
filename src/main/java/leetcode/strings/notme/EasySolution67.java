package leetcode.strings.notme;

/**

Given two binary strings, return their sum (also a binary string).
The input strings are both non-empty and contains only characters 1 or 0.

Ex.: a = "11", b = "1" -> "100"
     a = "1010", b = "1011" -> "10101"

Explanation: the solution is based on the ASCII codes. Suppose we have '5' - '0'. In result we have 5. This is because
during this operation Java calculates the statement 53 - 48 = 5, where 53 is '5's ASCII code and 48 - ACSII code for '0'.

*/

public class EasySolution67 {

    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            res.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) res.append(carry);
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println('5' - '0');
        EasySolution67 solution67 = new EasySolution67();
        System.out.println(solution67.addBinary("11", "1"));
        System.out.println(solution67.addBinary("111", "11"));
    }
}

package leetcode.strings.me;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * Ex.: "A man, a plan, a canal: Panama" -> true
 *      "race a car" -> false
 */
public class EasySolution125 {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1, k = 0, r = s.length() - 1;
        while (k < r) {
            if (!Character.isLetterOrDigit(i)) {
                i++; r--;
                continue;
            }
            if (!Character.isLetterOrDigit(j)) {
                j--; r--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
            i++; j--; k++; r--;
        }
        return true;
    }
    public static void main(String[] args) {
        EasySolution125 solution125 = new EasySolution125();
        System.out.println(solution125.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution125.isPalindrome("race a car"));
        System.out.println(solution125.isPalindrome("!c"));
        System.out.println(solution125.isPalindrome(""));
        System.out.println(solution125.isPalindrome("0P"));
    }
}

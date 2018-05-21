package leetcode.strings;

/**
 * Created by shamil.valiev on 5/15/2018.
 */
public class EasySolution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length() - 1 || c != strs[j].charAt(i))
                    return res.toString();
            }
            res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        EasySolution14 solution14 = new EasySolution14();
        System.out.println(solution14.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(solution14.longestCommonPrefix(new String[]{"dog", "recar", "car"}));
        System.out.println(solution14.longestCommonPrefix(new String[]{"andrey", "andreychick", "andreyidze"}));
        System.out.println(solution14.longestCommonPrefix(new String[]{"c", "c"}));
        System.out.println(solution14.longestCommonPrefix(new String[]{}));
    }
}

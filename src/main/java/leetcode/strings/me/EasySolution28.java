package leetcode.strings.me;

/**
 * Created by shamil.valiev on 5/16/2018.
 */
public class EasySolution28 {
    public int strStr(String haystack, String needle) {
        if (haystack.isEmpty() && needle.isEmpty()) return 0;
        if (needle.isEmpty()) return 0;
        char[] hays = haystack.toCharArray();
        char[] needles = needle.toCharArray();
        int i = 0;
        while (i < hays.length) {
            int k = i; int j = 0;
            while (j < needles.length && k < hays.length && hays[k] == needles[j]) {
                k++; j++;
            }
            if (j == needles.length) return i;
            i++;
        }
        return -1;
    }

    public int strStrBetter(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }

    public static void main(String[] args) {
        "iisis".indexOf("a");
        EasySolution28 easySolution28 = new EasySolution28();
        System.out.println(easySolution28.strStrBetter("hello", "ll"));
        System.out.println(easySolution28.strStrBetter("arna", ""));
        System.out.println(easySolution28.strStrBetter("arna", "ha"));
        System.out.println(easySolution28.strStrBetter("arna", "ah"));
        System.out.println(easySolution28.strStrBetter("arna", "a"));
        System.out.println(easySolution28.strStrBetter("arnas", "s"));
        System.out.println(easySolution28.strStrBetter("", ""));
        System.out.println(easySolution28.strStrBetter("mississippi", "issip"));
    }
}


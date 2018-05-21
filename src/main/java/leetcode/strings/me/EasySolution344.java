package leetcode.strings.me;

/**
 * Created by shamil.valiev on 5/15/2018.
 */
public class EasySolution344 {

    public String reverseString(String s) {
        StringBuilder res = new StringBuilder();
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--)
            res.append(ch[i]);
        return res.toString();
    }

    public String reverseString2(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length - 1;
        while (left < right)
            swap(ch, left++, right--);
        return String.valueOf(ch);
    }

    private void swap(char[] ch, int left, int right) {
        char c = ch[left];
        ch[left] = ch[right];
        ch[right] = c;
    }

    public static void main(String[] args) {
        EasySolution344 solution344 = new EasySolution344();
        System.out.println(solution344.reverseString2("hello"));
        System.out.println(solution344.reverseString2("h"));
        System.out.println(solution344.reverseString2(""));
    }

}

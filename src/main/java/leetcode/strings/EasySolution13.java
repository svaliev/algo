package leetcode.strings;

/**
 * Created by shamil.valiev on 5/14/2018.
 */
public class EasySolution13 {

    public int romanToInt(String s) {
        int res = 0;
        char[] ch = s.toCharArray();
        int i = 0;
        while (i < ch.length) {
            int a = romanCharToInt(ch[i]);
            if (i + 1 < ch.length) {
                int b = romanCharToInt(ch[i+1]);
                if (b > a) {
                    a = b - a;
                    i++;
                }
            }
            res += a;
            i++;
        }
        return res;
    }

    private int romanCharToInt(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Wrong argument");
        }
    }

    public static void main(String[] args) {
        EasySolution13 solution13 = new EasySolution13();
        System.out.println(solution13.romanToInt("III"));
        System.out.println(solution13.romanToInt("IV"));
        System.out.println(solution13.romanToInt("IX"));
        System.out.println(solution13.romanToInt("LVIII"));
        System.out.println(solution13.romanToInt("MCMXCIV"));
    }
}

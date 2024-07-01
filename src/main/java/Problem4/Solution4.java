package src.main.java.Problem4;

import java.util.Set;

public class Solution4 {

    public static void main(String[] args) {
        // Solution4 s4 = new Solution4();

    }

    public boolean wordBreak(String s, Set<String> dict, int type) {
        boolean res = false;
        switch (type) {
            case 1:
                res = wordBreakHelper(0, s, dict);
                break;

            case 2:
                res = wordBreakHelperDP(0, s, dict);
                break;

            default:
                break;
        }
        return res;
    }

    public boolean wordBreakHelper(int i, String str, Set<String> dict) {
        if (i == str.length()) {
            return true;
        }

        for (int j = i; j < str.length(); j++) {
            if (dict.contains(str.substring(i, j + 1))) {
                if (wordBreakHelper(j + 1, str, dict)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean wordBreakHelperDP(int i, String str, Set<String> dict) {
        return false;
    }
}

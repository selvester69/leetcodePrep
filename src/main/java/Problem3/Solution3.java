package src.main.java.Problem3;

import src.main.util.Util;

public class Solution3 {

    public String longestPalindromicSubstring(String str, int solutionType) {
        String seq = "";

        switch (solutionType) {
            case 1:
                seq = naiveMethod(str);
                break;

            case 2:
                seq = withoutDP(str);
                break;

            case 3:
                seq = withDP(str);
                break;

            default:
                break;
        }

        return seq;

    }

    public String naiveMethod(String s) {
        int n = s.length();
        if (n <= 1) {
            return s;
        }
        String longsequence = s.charAt(0) + "";
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int len = j - i;
                String curr = s.substring(i, j + 1);
                if (Util.isPalindromic(curr, 0, len)) {
                    if (len > maxLength) {
                        maxLength = len;
                        longsequence = curr;
                    }
                }
            }
        }

        return longsequence;
    }

    public String withoutDP(String s) {
        int n = s.length();
        if (n <= 1) {
            return s;
        }
        String longsequence = "";
        int maxLength = 0;
        for (int i = 0; i < n - 1; i++) {
            // for odd cases which is centered around i
            int left = i, right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                int len = right - left + 1;
                if (len > maxLength) {
                    maxLength = len;
                    longsequence = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
            // this is for even case
            left = i;
            right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                int len = right - left + 1;
                if (len > maxLength) {
                    maxLength = len;
                    longsequence = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }
        return longsequence;
    }

    // first fill table for n=1 and n=2
    // for n>2 use following
    // dp[i][j] = 1 if i: dp[i-1][j+1] ==1 &&
    // ii: s[i]==s[j]

    public String withDP(String s) {
        int n = s.length();
        if (s == null || n <= 1) {
            return s;
        }
        String longsequence = s.charAt(0) + "";
        int maxLength = 0;
        int[][] dp = new int[n][n];
        // prepopulate dp
        // length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        // length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                longsequence = s.substring(i, i + 2);
            }
        }
        // Util.printMatrix(dp);
        // for length>2
        for (int l = 2; l < n; l++) {
            for (int i = 0; i < n - l; i++) {
                int j = i + l;
                if (dp[i + 1][j - 1] == 1 && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 1;
                    if (l + 1 > maxLength) {
                        longsequence = s.substring(i, j + 1);
                        maxLength = l + 1;
                    }
                }
            }
        }
        Util.printMatrix(dp);

        return longsequence;
    }

    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        String res = s3.longestPalindromicSubstring("aaaabbaa", 3);
        System.out.println(res);
    }

}

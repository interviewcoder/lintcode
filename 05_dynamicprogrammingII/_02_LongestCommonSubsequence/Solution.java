/**
 * Time : O() ; Space: O()
 * @tag : LintCode Copyright; Dynamic Programming
 * @by  : Steven Cooks
 * @date: Sep 8, 2015
 ***************************************************************************
 * Description:
 * Given two strings, find the longest common subsequence (LCS). 
 * Your code should return the length of LCS. 
 * 
 * Example 
 * For "ABCD" and "EDCA", the LCS is "A" (or "D", "C"), return 1. 
 * For "ABCD" and "EACB", the LCS is "AC", return 2.
 * 
 ***************************************************************************
 * {@link http://www.lintcode.com/en/problem/longest-common-subsequence }
 */
package _02_LongestCommonSubsequence;

/** see test {@link _02_LongestCommonSubsequence.SolutionTest } */
public class Solution {

    public int longestCommonSubsequence(String A, String B) {
        int[][] dp = new int[A.length() + 1][B.length() + 1];
        for (int i = A.length(); i >= 0; i--) {
            for (int j = B.length(); j >= 0; j--) {
                int len = 0;
                if (i < A.length() && j < B.length()) {
                    if (A.charAt(i) == B.charAt(j)) {
                        len = 1 + dp[i + 1][j + 1];
                    } else {
                        len = Math.max(dp[i + 1][j], dp[i][j + 1]);
                    }
                }
                dp[i][j] = len;
            }
        }
        return dp[0][0];
    }

    // verbose bottom-up dynamic programming version
    public int longestCommonSubsequence2(String A, String B) {
        int[][] dp = new int[A.length() + 1][B.length() + 1];
        for (int i = A.length(); i >= 0; i--) {
            for (int j = B.length(); j >= 0; j--) {
                int len = 0;
                if (i == A.length() && j == B.length()) {
                    len = 0;
                } else if (i == A.length()) {
                    len = 0;
                } else if (j == B.length()) {
                    len = 0;
                } else {
                    if (A.charAt(i) == B.charAt(j)) {
                        len = 1 + dp[i + 1][j + 1];
                    } else {
                        len = Math.max(dp[i + 1][j], dp[i][j + 1]);
                    }
                }
                dp[i][j] = len;
            }
        }
        return dp[0][0];
    }

    // pure backtracking version
    public int longestCommonSubsequence3(String A, String B) {
        return LCS(A, 0, B, 0);
    }

    private int LCS(String A, int i, String B, int j) {
        if (i == A.length() && j == B.length()) {
            return 0;
        } else if (i == A.length()) {
            return 0;
        } else if (j == B.length()) {
            return 0;
        } else {
            if (A.charAt(i) == B.charAt(j)) {
                return 1 + LCS(A, i + 1, B, j + 1);
            } else {
                return Math.max(LCS(A, i + 1, B, j), LCS(A, i, B, j + 1));
            }
        }
    }

}

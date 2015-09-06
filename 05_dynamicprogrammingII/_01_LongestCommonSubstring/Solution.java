/**
 * Time : O(n * m) ; Space: O()
 * @tag : LintCode Copyright; Dynamic Programming
 * @by  : Steven Cooks
 * @date: Sep 6, 2015
 ***************************************************************************
 * Description:
 * 
 * Given two strings, find the longest common substring. 
 * Return the length of it.
 * 
 * Example Given A = "ABCD", B = "CBCE", return 2.
 * 
 * Note 
 * The characters in substring should occur continuously in original string. 
 * This is different with subsequence.
 * 
 ***************************************************************************
 * {@link http://www.lintcode.com/en/problem/longest-common-substring/ }
 */
package _01_LongestCommonSubstring;

/** see test {@link _01_LongestCommonSubstring.SolutionTest } */
public class Solution {

    public int longestCommonSubstring(String A, String B) {
        int len1 = A.length();
        int len2 = B.length();
        int res = 0;
        int[][] dp = new int[len1 + 1][len2 + 1];
        // take advantage of default value of array
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int common = 0;
                if (i < len1 && j < len2 && A.charAt(i) == B.charAt(j)) {
                    common = 1 + dp[i + 1][j + 1];
                }
                dp[i][j] = common;
                res = Math.max(res, common);
            }
        }
        return res;
    }

    public int longestCommonSubstringTemplate(String A, String B) {
        int len1 = A.length();
        int len2 = B.length();
        int res = 0;
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = len1; i >= 0; i--) {
            for (int j = len2; j >= 0; j--) {
                int common = 0;
                if (i == len1 && j == len2) {
                    common = 0;
                } else if (i == len1) {
                    common = 0;
                } else if (j == len2) {
                    common = 0;
                } else {
                    if (A.charAt(i) == B.charAt(j)) {
                        common = 1 + dp[i + 1][j + 1];
                    } else {
                        common = 0;
                    }
                }
                dp[i][j] = common;
                res = Math.max(res, common);
            }
        }
        return res;
    }

}

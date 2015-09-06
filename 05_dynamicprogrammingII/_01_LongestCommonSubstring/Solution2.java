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
public class Solution2 {
    
    public int longestCommonSubstring(String A, String B) {
        int len1 = A.length();
        int len2 = B.length();
        int res = 0;
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                int p = i;
                int q = j;
                while (p < len1 && q < len2 && A.charAt(p) == B.charAt(q)) {
                    p++;
                    q++;
                }
                res = Math.max(res, p - i);
            }
        }
        return res;
    }

}

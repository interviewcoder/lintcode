/**
 * Time : O() ; Space: O()
 * @tag : 
 * @by  : Steven Cooks
 * @date: Sep 4, 2015
 ***************************************************************************
 * Description:
 * 
 * Given a sequence of integers, find the longest increasing subsequence (LIS). 
 * You code should return the length of the LIS.
 * 
 * Example 
 * For [5, 4, 1, 2, 3], the LIS  is [1, 2, 3], return 3 
 * For [4, 2, 4, 5, 3, 7], the LIS is [4, 4, 5, 7], return 4
 * 
 ***************************************************************************
 * {@link http://www.lintcode.com/en/problem/longest-increasing-subsequence/# }
 */
package _01_LongestIncreasingSubsequence;

/** see test {@link _01_LongestIncreasingSubsequence.SolutionTest } */
public class Solution {
    
    public int longestIncreasingSubsequence(int[] nums) {
        int n = nums.length;
        // dp[i] = length of longest subsequence that ending by nums[i]
        int[] dp = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int len = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] <= num) {
                    len = Math.max(len, dp[j] + 1);
                }
            }
            dp[i] = len;
            res = Math.max(res, dp[i]);
        }
        return res;
    }

}

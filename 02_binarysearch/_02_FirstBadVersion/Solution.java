/**
 * Time : O(lgN) ; Space: O(1)
 * @tag : Binary Search; LintCode Copyright
 * @by  : Steven Cooks
 * @date: Aug 23, 2015
 ***************************************************************************
 * Description:
 * 
 * he code base version is an integer start from 1 to n. One day, someone 
 * committed a bad version in the code case, so it caused this version and 
 * the following versions are all failed in the unit tests. Find the first 
 * bad version. 
 * 
 * You can call isBadVersion to help you determine which version is the first 
 * bad one. The details interface can be found in the code's annotation part.
 * 
 ***************************************************************************
 * {@link http://www.lintcode.com/en/problem/first-bad-version/ }
 */
package _02_FirstBadVersion;

/** see test {@link _02_FirstBadVersion.SolutionTest } */
public class Solution {
    
    public int findFirstBadVersion(int n) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean isBad = isBad(mid);
            if (!isBad) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // return the order not the index of bad version
        // if require return -1 for situation no bad version exists
        // then return (left + 1) > n ? -1 : (left + 1);
        return left + 1;
    }
    
    // wrap the API call
    private boolean isBad (int v) {
        return VersionControl.isBadVersion(v + 1);
    }

}

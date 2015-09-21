/**
 * Time : O(N^3) ; Space: O()
 * @tag : Two Pointers; Sort; Hash Table; Array
 * @by  : Steven Cooks
 * @date: Sep 20, 2015
 ***************************************************************************
 * Description:
 * 
 * Given an array S of n integers, are there elements a, b, c, and d in S 
 * such that a + b + c + d = target? Find all unique quadruplets in the array 
 * which gives the sum of target.
 * 
 ***************************************************************************
 * {@link http://www.lintcode.com/en/problem/4-sum/ }
 */
package _04_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** see test {@link _04_4Sum.SolutionTest } */
public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            // skip duplicates
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                // two pointers to find target
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right])));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                }
            }
        }
        return res;
    }

}

/**
 * Time : O() ; Space: O()
 * @tag : Binary Search Tree
 * @by  : Steven Cooks
 * @date: Sep 1, 2015
 ***************************************************************************
 * Description:
 * 
 * Given two values k1 and k2 (where k1 < k2) and a root pointer to a Binary 
 * Search Tree. Find all the keys of tree in range k1 to k2. i.e. print all 
 * x such that k1<=x<=k2 and x is a key of given BST. Return all the keys 
 * in ascending order.
 *
 ***************************************************************************
 * {@link http://www.lintcode.com/en/problem/search-range-in-binary-search-tree/ }
 */
package _02_SearchRangeInBinarySearchTree;

import java.util.ArrayList;

import com.leetcode.TreeNode;

/** see test {@link _02_SearchRangeInBinarySearchTree.SolutionTest } */
public class Solution {

    /**
     * @param root: The root of the binary search tree.
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in ascending order.
     */
    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        int val = root.val;
        if (val >= k1) {
            // pruning
            res.addAll(searchRange(root.left, k1, k2));
        }
        if (val >= k1 && val <= k2) {
            res.add(val);
        }
        if (val <= k2) {
            // pruning
            res.addAll(searchRange(root.right, k1, k2));
        }
        return res;
    }

}

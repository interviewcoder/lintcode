/**
 * Time : O() ; Space: O()
 * @tag : LintCode Copyright; Binary Search Tree
 * @by  : Steven Cooks
 * @date: Aug 26, 2015
 ***************************************************************************
 * Description:
 *
 * 
 ***************************************************************************
 * {@link http://www.lintcode.com/en/problem/insert-node-in-a-binary-search-tree/# }
 */
package InsertNodeInABinarySearchTree;

import com.leetcode.TreeNode;

/** see test {@link InsertNodeInABinarySearchTree.SolutionTest } */
public class Solution {

    public TreeNode insertNode(TreeNode root, TreeNode node) {
        TreeNode x = root;
        while (x != null) {
            if (x.val > node.val) {
                if (x.left == null) {
                    x.left = node;
                    return root;
                } else {
                    x = x.left;
                }
            } else if (x.val < node.val) {
                if (x.right == null) {
                    x.right = node;
                    return root;
                } else {
                    x = x.right;
                }
            } else {
                return root;
            }
        }
        return node;
    }

}

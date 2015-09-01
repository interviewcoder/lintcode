package _01_InsertNodeInABinarySearchTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {
    
    /** Test method for {@link _01_InsertNodeInABinarySearchTree.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    // null  =>  1
    @Test
    public void Test1() {
        TreeNode root = null;
        TreeNode node = new TreeNode(1);
        TreeNode actual = solution.insertNode(root, node);
        TreeNode expected = new TreeNode(1);
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //  1   =>  1
    //            \
    //             2
    @Test
    public void Test2() {
        TreeNode root = new TreeNode(1);
        TreeNode node = new TreeNode(2);
        TreeNode actual = solution.insertNode(root, node);
        TreeNode expected = new TreeNode(1);
        expected.right = new TreeNode(2);
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

    //  3   =>   3
    //          /
    //         2 
    @Test
    public void Test3() {
        TreeNode root = new TreeNode(3);
        TreeNode node = new TreeNode(2);
        TreeNode actual = solution.insertNode(root, node);
        TreeNode expected = new TreeNode(3);
        expected.left = new TreeNode(2);
        assertTrue(TreeNode.isSameTree(actual, expected));
    }

}

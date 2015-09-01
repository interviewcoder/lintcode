package _02_SearchRangeInBinarySearchTree;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.leetcode.TreeNode;

public class SolutionTest {
    
    /** Test method for {@link _02_SearchRangeInBinarySearchTree.Solution } */
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

    //   1
    @Test
    public void Test1() {
        TreeNode root = TreeNode.getBST1();
        int k1 = 0;
        int k2 = 2;
        ArrayList<Integer> actual = solution.searchRange(root, k1, k2);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, actual);
    }

    //   1 
    //    \
    //     2
    //      \
    //       3 
    @Test
    public void Test2() {
        TreeNode root = TreeNode.getBST2();
        int k1 = 1;
        int k2 = 2;
        ArrayList<Integer> actual = solution.searchRange(root, k1, k2);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, actual);
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    @Test
    public void Test3() {
        TreeNode root = TreeNode.getBST5();
        int k1 = 6;
        int k2 = 13;
        ArrayList<Integer> actual = solution.searchRange(root, k1, k2);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(7);
        expected.add(10);
        expected.add(12);
        assertEquals(expected, actual);
    }

    //      2 
    //    /   \
    //   1     3
    @Test
    public void Test4() {
        TreeNode root = TreeNode.getBST4();
        int k1 = 0;
        int k2 = 5;
        ArrayList<Integer> actual = solution.searchRange(root, k1, k2);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, actual);
    }

}

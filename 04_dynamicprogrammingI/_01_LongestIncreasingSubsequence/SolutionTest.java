package _01_LongestIncreasingSubsequence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _01_LongestIncreasingSubsequence.Solution } */
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

    // [1, 2, 3]
    @Test
    public void Test1() {
        int[] nums = { 5, 4, 1, 2, 3 };
        int actual = solution.longestIncreasingSubsequence(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }

    // [4, 4, 5, 7] or [2, 4, 5, 7]
    @Test
    public void Test2() {
        int[] nums = { 4, 2, 4, 5, 3, 7 };
        int actual = solution.longestIncreasingSubsequence(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }

    // [1, 2, 3, 11]
    @Test
    public void Test3() {
        int[] nums = { 10, 1, 11, 2, 12, 3, 11 };
        int actual = solution.longestIncreasingSubsequence(nums);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = { 4, 2, 4, 5, 3, 7, 3, 3, 3, 3 };
        int actual = solution.longestIncreasingSubsequence(nums);
        int expected = 6;
        assertEquals(expected, actual);
    }

}

package _02_LongestCommonSubsequence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _02_LongestCommonSubsequence.Solution } */
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

    @Test
    public void Test1() {
        String A = "ABCD";
        String B = "EDCA";
        int actual = solution.longestCommonSubsequence(A, B);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String A = "ABCD";
        String B = "EACB";
        int actual = solution.longestCommonSubsequence(A, B);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String A = "XYZ";
        String B = "EACB";
        int actual = solution.longestCommonSubsequence(A, B);
        int expected = 0;
        assertEquals(expected, actual);
    }

}

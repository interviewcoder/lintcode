package _01_LongestCommonSubstring;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _01_LongestCommonSubstring.Solution } */
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
        String B = "CBCE";
        int actual = solution.longestCommonSubstring(A, B);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String A = "ABC";
        String B = "DEF";
        int actual = solution.longestCommonSubstring(A, B);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String A = "ABC";
        String B = "ABCDEFG";
        int actual = solution.longestCommonSubstring(A, B);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String A = "DEFG";
        String B = "ABCDEFG";
        int actual = solution.longestCommonSubstring(A, B);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String A = "CDEFG";
        String B = "ABCDEFGHI";
        int actual = solution.longestCommonSubstring(A, B);
        int expected = 5;
        assertEquals(expected, actual);
    }

}

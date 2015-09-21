package _04_4Sum;

import static com.lintcode.Test.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _04_4Sum.Solution } */
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
        int[] numbers = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        List<List<Integer>> actual = solution.fourSum(numbers, target);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, 0, 0, 1));
        expected.add(Arrays.asList(-2, -1, 1, 2));
        expected.add(Arrays.asList(-2, 0, 0, 2));
        assertEqualsIgnoreOrder(expected, actual);
    }

}

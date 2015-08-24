package _02_FirstBadVersion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _02_FirstBadVersion.Solution } */
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
        int n = 5;
        boolean[] controls = new boolean[n];
        int expected = 4;
        customControls(expected, controls);
        VersionControl.setControls(controls);
        int actual = solution.findFirstBadVersion(n);
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int n = 31;
        boolean[] controls = new boolean[n];
        int expected = 1;
        customControls(expected, controls);
        VersionControl.setControls(controls);
        int actual = solution.findFirstBadVersion(n);
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int n = 4;
        boolean[] controls = new boolean[n];
        int expected = 4;
        customControls(expected, controls);
        VersionControl.setControls(controls);
        int actual = solution.findFirstBadVersion(n);
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int n = 10;
        boolean[] controls = new boolean[n];
        int expected = 10;
        customControls(expected, controls);
        VersionControl.setControls(controls);
        int actual = solution.findFirstBadVersion(n);
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int n = 10;
        boolean[] controls = new boolean[n];
        int expected = 11;
        customControls(expected, controls);
        VersionControl.setControls(controls);
        int actual = solution.findFirstBadVersion(n);
        assertEquals(11, actual);
    }

    private void customControls(int expected, boolean[] controls) {
        for (int i = expected - 1; i < controls.length; i++) {
            controls[i] = true;
        }
    }


}

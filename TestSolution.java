package testSolution;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSolution {
    Solution s = null;

    @Before
    public void setUp() {
        s = new Solution();
    }

    @Test
    public void testMaxEvents() {
        int[][] t1 = {{1,2},{3,4}};
        int[][] t2 = {{1,2},{1,2}};
        int[][] t3 = {{1,2},{5,6},{1,1}};
        assertEquals(1, s.maxEvents(t1));
        assertEquals(1, s.maxEvents(t2));
        assertEquals(3, s.maxEvents(t3));

    }
}

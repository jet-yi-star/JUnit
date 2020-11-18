package testSolution;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSolution2 {
    Solution s = null;

    @Before
    public void setUp() {
        s = new Solution();
    }

    @Test
    public void testMaxEvents() {

        int[][] t2 = {{1,2},{1,2}};


        assertEquals(1, s.maxEvents(t2));


    }
}

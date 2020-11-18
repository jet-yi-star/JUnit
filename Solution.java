package testSolution;
//https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/submissions/
import java.util.Arrays;
import java.util.TreeSet;

class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (int[] a1, int[] a2)->{if (a1[1] != a2[1]) {
            return a1[1] - a2[1];
        }

            return a1[0] - a2[0];});
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= events[events.length - 1][1]; i++) {
            set.add(i);
        }
        int res = 0;
        for (int i = 0; i < events.length; i++) {
            int start = events[i][0], end = events[i][1];
            if (set.ceiling(start) == null ) {
                continue;
            }
            int num = set.ceiling(start);
            if (num <= end) {
                set.remove(num);
                res++;
            }


        }
        return res;
    }
}

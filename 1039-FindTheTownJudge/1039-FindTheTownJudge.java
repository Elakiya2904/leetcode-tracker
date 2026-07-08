// Last updated: 7/8/2026, 3:56:40 PM
class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] count = new int[n + 1];

        for (int[] person : trust) {
            count[person[0]]--;
            count[person[1]]++;
        }

        for (int person = 1; person <= n; person++) {
            if (count[person] == n - 1) {
                return person;
            }
        }

        return -1;
    }
}
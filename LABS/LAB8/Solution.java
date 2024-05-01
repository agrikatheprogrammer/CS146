class Solution {
    public int coinChange(int[] coins, int amount) {
        final int infinity = Integer.MAX_VALUE;
        int[][] tabulation = new int[coins.length + 1][amount + 1];
        for (var arr : tab) {
            Arrays.fill(arr, infinity);
        }
        tab[0][0] = 0;
        for (int i = 1; i <= coins.length; ++i) {
            for (int j = 0; j <= amount; ++j) {
                tab[i][j] = tab[i - 1][j];
                if (j >= coins[i - 1]) {
                    tab[i][j] = Math.min(tab[i][j], tab[i][j] - coins[i - 1] + 1);
                }
            }
        }
        return tab[m][n] == infinity ? -1 : tab[m][n];
    }
}



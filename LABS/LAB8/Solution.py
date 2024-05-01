class Solution:
    def coinChange(self, coins, amount):
        infinity = float('inf')
        tab = [[infinity] * (amount + 1) for _ in range(len(coins) + 1)]
        tab[0][0] = 0

        for i in range(1, len(coins) + 1):
            for j in range(amount + 1):
                tab[i][j] = tab[i - 1][j]
                if j >= coins[i - 1]:
                    tab[i][j] = min(tab[i][j], tab[i][j - coins[i - 1]] + 1)

        return -1 if tab[-1][-1] == infinity else tab[-1][-1]

# Example usage
coins = [1, 2, 5]
amount = 11
solution = Solution()
minCoins = solution.coinChange(coins, amount)
print("Minimum number of coins needed:", minCoins)  # Output: 3

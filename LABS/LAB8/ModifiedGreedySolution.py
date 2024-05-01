class Solution:
    def coinChange(self, coins, amount):
        coins.sort(reverse=True)  # Sort coins in descending order

        def backtrack(remaining, index, count):
            if remaining == 0:
                return count
            if index == len(coins):
                return float('inf')

            max_coins = remaining // coins[index]
            min_count = float('inf')

            for i in range(max_coins, -1, -1):
                if count + i >= min_count:
                    break
                min_count = min(min_count, backtrack(remaining - i * coins[index], index + 1, count + i))

            return min_count

        result = backtrack(amount, 0, 0)
        return result if result != float('inf') else -1

# Example usage
coins = [1, 2, 5]
amount = 11
solution = Solution()
minCoins = solution.coinChange(coins, amount)
print("Minimum number of coins needed:", minCoins)  # Output: 3

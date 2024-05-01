# Coin Change Problem
## Overview
The coin change problem is a classic algorithmic problem in which we are given a set of coin denominations and a target amount to make with those coins. The objective is to find the minimum number of coins needed to make up the target amount.

# Approach: Dynamic Programming (knapsack)
Dynamic programming is a powerful technique used to solve optimization problems by breaking them down into simpler subproblems. Here's how we can apply dynamic programming to solve the coin change problem:

* Initialization: Create a 2D array tab with dimensions [coins.length + 1][amount + 1] to store the minimum number of coins needed to make up each amount using various subsets of the given coins. Initialize all cells with a value of Integer.MAX_VALUE, except for tab[0][0] which is set to 0 since it requires 0 coins to make up amount 0.

* Tabulation: Iterate over each coin denomination and each possible amount from 0 to amount. For each coin denomination coins[i], and each amount j, update tab[i][j] as follows:


    Initialize tab[i][j] with the value from the row above (tab[i-1][j]), indicating the minimum number of coins needed without using the current coin denomination. If j is greater than or equal to the value of the current coin denomination coins[i-1], update tab[i][j] to the minimum of its current value and tab[i][j - coins[i-1]] + 1, which represents the minimum number of coins needed by including the current coin denomination.

* Result: The minimum number of coins needed to make up the target amount amount using the given coins is stored in tab[coins.length][amount]. If this value is Integer.MAX_VALUE, it means it's not possible to make the amount with the given coins, so return -1. Otherwise, return the value stored in tab[coins.length][amount].

## Complexity Analysis
* Time Complexity: The time complexity of this dynamic programming solution is O(coins.length * amount), where coins.length is the number of coin denominations and amount is the target amount.
* Space Complexity: The space complexity is also O(coins.length * amount) due to the use of the tab array.



# ALTERNATIVE Greedy Approach for Coin Change Problem
## Overview
The coin change problem is a classic algorithmic problem where the objective is to find the minimum number of coins needed to make up a given amount. The greedy approach is one way to tackle this problem, where at each step, we choose the largest possible coin denomination that can fit into the remaining amount.

## Approach: Modified Greedy Algorithm with Backtracking
* Sort Coins: Sort the available coin denominations in descending order. This allows us to start with the largest denomination first.
* Backtracking: Use a recursive backtracking approach to try all possible combinations of coins. At each step:


    Determine the maximum number of the current coin denomination that can fit into the remaining amount.
Recursively explore all possible combinations with the remaining coins and remaining amount.
* Result: Return the minimum count of coins needed if a solution is found. If no solution is possible, return -1.

## Complexity Analysis

* Time Complexity: The time complexity of the greedy approach with backtracking depends on the number of coins and the target amount. In the worst case, it can be exponential, making it less efficient compared to dynamic programming.
* Space Complexity: The space complexity is determined by the recursion depth, which is related to the number of coins and the target amount.


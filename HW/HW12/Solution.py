class Solution:
    def minCostToSupplyWater(self, n, wells, pipes):
        possible_edges = pipes + [[0, i + 1, wells[i]] for i in range(n)]
        possible_edges.sort(key=lambda x: x[2])
        self.parents = [i for i in range(n + 1)]
        result = 0
        for edge in possible_edges:
            start, destination, cost = edge
            startp = self.find(start)
            destp = self.find(destination)
            if startp != destp:
                self.parents[startp] = destp
                result += cost
                n -= 1
                if n == 0:
                    return result
        return result

    def find(self, x):
        if self.parents[x] != x:
            self.parents[x] = self.find(self.parents[x])
        return self.parents[x]

# Example usage:
n = 3
wells = [1, 2, 2]
pipes = [[1, 2, 1], [2, 3, 1]]
sol = Solution()
print(sol.minCostToSupplyWater(n, wells, pipes))  # Output: 3

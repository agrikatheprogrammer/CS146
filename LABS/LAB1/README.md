# Explanation
This problem can be solved using three well-known approaches: 
brute force, using a hash table (also known as the "two-pass" method), and using a hash table with a single pass (also known as the "one-pass" method). Let's discuss each approach:

# 1. Brute Force:
The brute force approach involves checking every pair of elements in the array to see if their sum equals the target. This approach has a time complexity of O(n^2), where n is the number of elements in the array.

# 2. Two-pass Hash Table:
In this approach, we first create a hash table to store the indices of elements in the array. Then, we iterate through the array and for each element, we check if its complement (target - current element) exists in the hash table. This approach has a time complexity of O(n) since the look-up time for a value in a hash table is O(1).

# 3. One-pass Hash Table:
The one-pass hash table approach is similar to the two-pass approach, but it combines the loop to build the hash table and the loop to find the complement in a single pass. While iterating through the array, we check if the complement of the current element exists in the hash table. If it does, we return the indices of the current element and its complement. If not, we add the current element to the hash table. This approach also has a time complexity of O(n).

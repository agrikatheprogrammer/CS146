# PROBLEM STATEMENT
Here's the problem statement:

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

This time, your problem has additional details:

Constraints:

The solution set must not contain duplicate triplets.
The order of the output and the order of the triplets does not matter.
3 <= nums.length <= 3000
-105 <= nums[i] <= 105
 

Function definition for Java: 

    public List<List<Integer>> threeSum(int[] nums) {

       // Your code here

    }
Function definition for Python:
def threeSum(self, nums: List[int]) -> List[List[int]]:

  #Your code here
Announced Test Cases:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Input: nums = [-5,0,5,10,-10,0] 
Output: [[-10,0,10],[-5,0,5]] 
Explanation: There are two possible combinations of triplets that satisfy: (-5,0,5) and (-10,0,10).
Hint: There are 3 well-known ways to solve this problem!

Hint 2: This problem should remind you of another homework problem that you hopefully have already solved. 

Hint 3: This problem might benefit from the algorithms we have recently discussed in class!


# ThreeSum Algorithm

This algorithm is designed to find all unique triplets in an array of integers whose sum is equal to zero. It utilizes a two-pointer approach along with sorting to achieve an efficient solution.

## Approach Overview

The algorithm follows these steps:

1. **Sort the Array**: First, the input array of integers is sorted. Sorting the array allows us to efficiently find triplets with a specific sum.

2. **Iterate through the Array**: The algorithm iterates through each element of the sorted array.

3. **Two-Pointer Technique**: For each element at index `i`, two pointers `j` and `k` are initialized. Pointer `j` starts from `i + 1` and points to the element after `i`, while pointer `k` starts from the end of the array.

4. **Sum Calculation**: At each iteration, the algorithm calculates the sum of the current triplet (`nums[i] + nums[j] + nums[k]`).

5. **Check Sum**: Depending on the sum:
   - If the sum is greater than zero, decrement `k` to reduce the total sum.
   - If the sum is less than zero, increment `j` to increase the total sum.
   - If the sum is zero, add the triplet `(nums[i], nums[j], nums[k])` to the result list. Increment `j`, and skip duplicates by advancing `j` until it's different from the previous element.

6. **Continue Iteration**: The process continues until all possible triplets are checked.

7. **Avoid Duplicates**: To avoid duplicate triplets, the algorithm ensures that the same element is not considered as part of a triplet more than once. This is achieved by skipping elements that are the same as the previous element (`nums[i] == nums[i-1]`) and avoiding duplicates when advancing `j`.

## Input/Output

- **Input**: An array of integers (`nums`).
- **Output**: A list of unique triplets, where each triplet sums up to zero.

## Example

Input:
```
nums = [-1, 0, 1, 2, -1, -4]
```
Output:
```
[[-1, -1, 2], [-1, 0, 1]]
```

## Complexity Analysis

- **Time Complexity**: O(n^2)
  - Sorting the array takes O(n log n) time.
  - The main loop runs in O(n) time.
  - Within the loop, the two-pointer technique runs in O(n) time.
  - Thus, the overall time complexity is dominated by the sorting step.
  
- **Space Complexity**: O(1)
  - The space complexity is constant because the algorithm only uses a constant amount of extra space for storing variables and the result list.

---

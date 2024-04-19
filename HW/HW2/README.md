# PROBLEM STATEMENT:

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

# SOLUTION
This solution utilizes a binary search algorithm to efficiently find the first bad version among a sequence of versions. The isBadVersion API is employed to determine whether a specific version is bad or not.

## APPROACH
- Initialize two pointers, low and high, to represent the range of versions to search within. Set low to 0 and high to n, where n is the total number of versions.
- Enter a loop while low is less than or equal to high.
- Calculate the middle index using mid = low + (high - low) / 2.
- Check if the version at index mid is bad using the isBadVersion function:
- If it's not bad (isBadVersion(mid) == false), update low to mid + 1, narrowing the search range to the upper half.
- If it's bad, check if the previous version (mid - 1) is not bad:
- If the previous version is not bad (isBadVersion(mid - 1) == false), return mid as the first bad version found.
- If the previous version is also bad, update high to mid - 1, narrowing the search range to the lower half.
- If no bad version is found within the loop, return -1 to indicate that there are no bad versions.

## Runtime Analysis
- Average time complexity: θ(logn)
- Best time complexity: θ(1)
- Worst time complexity: θ(logn)
- Runtime: 32 ms
- This runtime beats 17.84% of users with Java, indicating moderate efficiency.
Memory Usage: 39.96 MB
This memory usage beats 85.55% of users with Java, indicating efficient memory management.
Conclusion
This binary search approach efficiently finds the first bad version among a sequence of versions, making use of the provided isBadVersion API. Despite being moderate in runtime efficiency, it manages memory usage efficiently.

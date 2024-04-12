Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Hint: There are 2 well-known ways to solve this problem

### Explanation of Anagram Solutions

#### Approach 1: O(n)

This solution iterates through each character in both input strings `s` and `v` to build lists of characters. Then, it checks if each character in `s` is present in `v`, and vice versa. Finally, it returns `true` only if both strings are subsets of each other.

- **Efficiency**: O(n), where n is the length of the longer string between `s` and `v`.
- **Explanation**: This approach has a linear time complexity because it iterates through each character of the strings once to build the character lists. Each list is traversed separately for checking if each string is subset of other string.

#### Approach 2: O(nlogn)

This solution sorts the characters of both input strings `string1` and `string2` using `Arrays.sort()` and then compares the sorted arrays for equality.

- **Efficiency**: O(nlogn), where n is the length of the longer string between `string1` and `string2`.
- **Explanation**: Sorting characters in array takes O(nlogn) time complexity.

#### Approach 3: O(n)

This solution uses counting to determine if two strings are anagrams. It counts the occurrences of each character in `string1` and subtracts the occurrences of each character in `string2`. If the counts are all zero, the strings are anagrams.

- **Efficiency**: O(n), where n is the length of the longer string between `string1` and `string2`.
- **Explanation**: It iterates through each character of the strings once, incrementing and decrementing counts in the `count` array. Then, it checks if all counts are zero, which is a constant-time operation x fixed size of 256 characters.
